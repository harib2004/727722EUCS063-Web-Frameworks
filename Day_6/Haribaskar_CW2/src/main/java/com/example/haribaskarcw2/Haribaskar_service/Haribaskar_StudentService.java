package com.example.haribaskarcw2.Haribaskar_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.haribaskarcw2.Haribaskar_model.Haribaskar_Student;
import com.example.haribaskarcw2.Haribaskar_repository.Haribaskar_StudentRepo;

@Service
public class Haribaskar_StudentService {

     @Autowired
     public Haribaskar_StudentRepo studentRepo;

     public List<Haribaskar_Student> getAll() {
          return studentRepo.findAll();
     }

     public Haribaskar_Student post(Haribaskar_Student student) {
          return studentRepo.save(student);
     }

     public List<Haribaskar_Student> sortedDetails(String field) {
          return studentRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }
}
