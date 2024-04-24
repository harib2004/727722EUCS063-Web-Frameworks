package com.example.bidirection.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.bidirection.model.Student;
import com.example.bidirection.model.StudentInfo;
import com.example.bidirection.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Haribaskar_StudentController {
    public Haribaskar_StudentService studentService;

    public Haribaskar_StudentController(Haribaskar_StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/api/poststudent")
    public Haribaskar_Student postMethodName(@RequestBody Haribaskar_Student student) {
        return studentService.saveStudent(student);
    }

    @PostMapping("/api/poststudentinfo")
    public Haribaskar_StudentInfo postMethodName(@RequestBody Haribaskar_StudentInfo studentInfo) {
        return studentService.saveStudentInfo(studentInfo);
    }

    @GetMapping("/api/student")
    public List<Haribaskar_Student> getMethodName() {
        return studentService.getStudents();
    }

}