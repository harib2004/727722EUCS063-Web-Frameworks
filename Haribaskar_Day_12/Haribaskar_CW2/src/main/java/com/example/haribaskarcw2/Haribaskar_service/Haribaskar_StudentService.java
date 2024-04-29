package com.example.haribaskarcw2.Haribaskar_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.haribaskarcw2.Haribaskar_model.Haribaskar_Student;
import com.example.haribaskarcw2.Haribaskar_repository.Haribaskar_StudentRepository;

@Service
public class Haribaskar_StudentService {
    @Autowired
    Haribaskar_StudentRepository studentRepository;
    public Haribaskar_Student addStudents(Haribaskar_Student student)
    {
        return studentRepository.save(student);
    }
    public List<Haribaskar_Student>getStudent()
    {
        return studentRepository.findAll();
    }
    public List<Haribaskar_Student>getStudentInner()
    {
        return studentRepository.getStudentInner();
    }
    public List<Haribaskar_Student>getStudentLeftOuter()
    {
        return studentRepository.getStudentsLeftOuter();
    }
    
}
