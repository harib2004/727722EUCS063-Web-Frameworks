package com.examly.haribaskar.Haribaskar_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.examly.haribaskar.*;
import com.examly.haribaskar.Haribaskar_model.Haribaskar_Person;
import com.examly.haribaskar.Haribaskar_repository.Haribaskar_PersonRepo;

@Service
public class PersonService {

     @Autowired
     public Haribaskar_PersonRepo personRepo;

     public Haribaskar_Person SaveEntity(Haribaskar_Person entity) {
          return personRepo.save(entity);

     }

     public List<Haribaskar_Person> getDetails() {
          return personRepo.findAll();

     }

     public List<Haribaskar_Person> findByAge(int byAge) {
          return personRepo.findByAge(byAge);
     }

}
