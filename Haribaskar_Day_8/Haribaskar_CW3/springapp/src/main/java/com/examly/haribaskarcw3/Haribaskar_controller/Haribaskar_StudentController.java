package com.examly.haribaskarcw3.Haribaskar_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examly.haribaskarcw3.Haribaskar_model.Haribaskar_Student;
import com.examly.haribaskarcw3.Haribaskar_service.Haribaskar_StudentService;

import java.util.*;

@RestController
public class Haribaskar_StudentController {
    @Autowired
    private Haribaskar_StudentService studentService;

    @PostMapping("/Student")
    public ResponseEntity<Haribaskar_Student> post(@RequestBody Haribaskar_Student student) {
        if (studentService.post(student)) {
            return new ResponseEntity<>(student, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/Student/marksGreaterThan/{mark}")
    public ResponseEntity<List<Haribaskar_Student>> getAll(@PathVariable int mark) {
        List<Haribaskar_Student> li = studentService.start(mark);
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/Student/marksLessThan/{mark}")
    public ResponseEntity<List<Haribaskar_Student>> getbyAge(@PathVariable int mark) {
        List<Haribaskar_Student> li = studentService.end(mark);
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
