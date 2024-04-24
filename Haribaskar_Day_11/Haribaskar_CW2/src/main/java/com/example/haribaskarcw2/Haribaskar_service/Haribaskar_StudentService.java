package com.example.haribaskarcw2.Haribaskar_service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.haribaskarcw2.Haribaskar_model.Haribaskar_Student;
import com.example.haribaskarcw2.Haribaskar_repository.Haribaskar_StudentRepository;

@Service
public class Haribaskar_StudentService {
    public Haribaskar_StudentRepository studentRepository;
    public Haribaskar_StudentService(Haribaskar_StudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }
    public Haribaskar_Student saveStudent(Haribaskar_Student student)
    {
        return studentRepository.save(student);
    }
    public List<Haribaskar_Student> getStudents()
    {
        return studentRepository.findAll();
    }
}
