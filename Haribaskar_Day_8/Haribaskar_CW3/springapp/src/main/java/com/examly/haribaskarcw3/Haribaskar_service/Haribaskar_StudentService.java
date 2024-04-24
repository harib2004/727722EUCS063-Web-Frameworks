package com.examly.haribaskarcw3.Haribaskar_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.haribaskarcw3.Haribaskar_model.Haribaskar_Student;
import com.examly.haribaskarcw3.Haribaskar_repository.Haribaskar_StudentRepo;

@Service
public class Haribaskar_StudentService {
    @Autowired
    private Haribaskar_StudentRepo studentRepo;

    public boolean post(Haribaskar_Student student) {
        try {
            studentRepo.save(student);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Haribaskar_Student> start(int mark) {
        return studentRepo.findByMarksGreaterThan(mark);
    }

    public List<Haribaskar_Student> end(int mark) {
        return studentRepo.findByMarksLessThan(mark);
    }

}
