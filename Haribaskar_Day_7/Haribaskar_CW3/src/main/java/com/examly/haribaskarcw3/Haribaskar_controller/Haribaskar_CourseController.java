package com.examly.haribaskarcw3.Haribaskar_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.examly.haribaskarcw3.Haribaskar_model.Haribaskar_Course;
import com.examly.haribaskarcw3.Haribaskar_service.Haribaskar_CourseService;

@RestController
public class Haribaskar_CourseController {

     @Autowired
     public Haribaskar_CourseService CourseService;

     @PostMapping("/api/course")
     public ResponseEntity<Haribaskar_Course> postMethodName(@RequestBody Haribaskar_Course entity) {

          Haribaskar_Course inst = CourseService.SaveEntity(entity);

          return new ResponseEntity<Haribaskar_Course>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/course")
     public ResponseEntity<List<Haribaskar_Course>> getMethodName() {

          List<Haribaskar_Course> show = CourseService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<Haribaskar_Course>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<Haribaskar_Course>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/course/{courseName}")
     public List<Haribaskar_Course> custom(@PathVariable String courseName) {
          return CourseService.findByCourseName(courseName);

     }
}