package com.example.haribaskarcw2.Haribaskar_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.haribaskarcw2.Haribaskar_model.Haribaskar_Student;
import com.example.haribaskarcw2.Haribaskar_service.Haribaskar_StudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class Haribaskar_StudentController {

     @Autowired
     public Haribaskar_StudentService studentService;

     @GetMapping("/api/student")
     public ResponseEntity<List<Haribaskar_Student>> getDetails() {
          List<Haribaskar_Student> list = studentService.getAll();
          if (list.isEmpty()) {
               return new ResponseEntity<List<Haribaskar_Student>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<Haribaskar_Student>>(list, HttpStatus.OK);

     }

     @PostMapping("/api/student")
     public ResponseEntity<Haribaskar_Student> postMethodName(@RequestBody Haribaskar_Student student) {

          Haribaskar_Student postData = studentService.post(student);
          return new ResponseEntity<>(postData, HttpStatus.OK);
     }

     @GetMapping("/api/student/sort/{field}")
     public ResponseEntity<List<Haribaskar_Student>> sortedDetails(@PathVariable String field) {
          List<Haribaskar_Student> list = studentService.sortedDetails(field);
          if (list.isEmpty()) {
               return new ResponseEntity<List<Haribaskar_Student>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<Haribaskar_Student>>(list, HttpStatus.OK);

     }
}
