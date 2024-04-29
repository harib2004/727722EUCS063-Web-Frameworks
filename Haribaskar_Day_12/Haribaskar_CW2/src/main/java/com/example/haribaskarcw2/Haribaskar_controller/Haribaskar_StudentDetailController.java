package com.example.haribaskarcw2.Haribaskar_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.haribaskarcw2.Haribaskar_model.Haribaskar_StudentDetail;
import com.example.haribaskarcw2.Haribaskar_service.Haribaskar_StudentDetailService;

@RestController
public class Haribaskar_StudentDetailController {
    @Autowired
    Haribaskar_StudentDetailService studentDetailService;
    
    @PostMapping("/studentDetail/student/{id}")
    public ResponseEntity<Haribaskar_StudentDetail> addStudentDetails(@PathVariable int id,@RequestBody Haribaskar_StudentDetail studentDetail)
    {
       return new ResponseEntity<>(studentDetailService.addStudentDetail(id,studentDetail),HttpStatus.CREATED);
    }
    
}
