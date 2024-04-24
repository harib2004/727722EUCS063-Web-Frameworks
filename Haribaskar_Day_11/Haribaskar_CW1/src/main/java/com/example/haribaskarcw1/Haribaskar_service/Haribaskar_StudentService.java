package com.example.haribaskarcw1.Haribaskar_service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bidirection.model.Student;
import com.example.bidirection.model.StudentInfo;
import com.example.bidirection.repository.StudentInfoRepository;
import com.example.bidirection.repository.StudentRepository;

@Service
public class Haribaskar_StudentService {
    public Haribaskar_StudentRepository studentRepository;
    public Haribaskar_StudentInfoRepository studentInfoRepository;

    public Haribaskar_StudentService(Haribaskar_StudentRepository studentRepository,
            Haribaskar_StudentInfoRepository studentInfoRepository) {
        this.studentRepository = studentRepository;
        this.studentInfoRepository = studentInfoRepository;
    }

    public Haribaskar_Student saveStudent(Haribaskar_Student student) {
        return studentRepository.save(student);
    }

    public Haribaskar_StudentInfo saveStudentInfo(Haribaskar_StudentInfo studentInfo) {
        return studentInfoRepository.save(studentInfo);
    }

    public List<Haribaskar_Student> getStudents() {
        return studentRepository.findAll();
    }
}
