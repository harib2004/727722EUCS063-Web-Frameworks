package com.example.haribaskarcw2.Haribaskar_controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.haribaskarcw2.Haribaskar_model.Haribaskar_Student;
import com.example.haribaskarcw2.Haribaskar_service.Haribaskar_StudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class Haribaskar_StudentController {
    public Haribaskar_StudentService studentService;
    public Haribaskar_StudentController(Haribaskar_StudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/student")
    public Haribaskar_Student postMethodName(@RequestBody Haribaskar_Student student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("/api/student")
    public List<Haribaskar_Student> getMethodName() {
        return studentService.getStudents();
    }
    
}
