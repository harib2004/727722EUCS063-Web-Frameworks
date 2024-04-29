package com.example.haribaskarcw2.Haribaskar_controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.haribaskarcw2.Haribaskar_model.Haribaskar_Student;
import com.example.haribaskarcw2.Haribaskar_service.Haribaskar_StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class Haribaskar_StudentController{
    @Autowired
    Haribaskar_StudentService studentService;
    @PostMapping("/student")
    public ResponseEntity<Haribaskar_Student> addStudents(@RequestBody Haribaskar_Student student)
    {
        return new ResponseEntity<>(studentService.addStudents(student),HttpStatus.CREATED);
    }
    
    @GetMapping("/students-inner-join")
    public ResponseEntity<List<Haribaskar_Student>>getStudentsInner()
    {
        return new ResponseEntity<>(studentService.getStudentInner(),HttpStatus.OK);
    }
    @GetMapping("/students-left-outer-join")
    public ResponseEntity<List<Haribaskar_Student>> getStudentsLeftOuter()
    {
        return new ResponseEntity<>(studentService.getStudentLeftOuter(),HttpStatus.OK);
    }
   
}


