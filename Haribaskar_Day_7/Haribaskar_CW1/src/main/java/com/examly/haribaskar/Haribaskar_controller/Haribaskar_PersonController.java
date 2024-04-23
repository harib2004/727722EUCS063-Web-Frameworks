package com.examly.haribaskar.Haribaskar_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examly.haribaskar.*;
import com.examly.haribaskar.Haribaskar_model.Haribaskar_Person;
import com.examly.haribaskar.Haribaskar_service.PersonService;

@RestController
public class Haribaskar_PersonController {

     @Autowired
     public PersonService personService;

     @PostMapping("/api/person")
     public ResponseEntity<Haribaskar_Person> postMethodName(@RequestBody Haribaskar_Person entity) {

          Haribaskar_Person inst = personService.SaveEntity(entity);

          return new ResponseEntity<Haribaskar_Person>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/person")
     public ResponseEntity<List<Haribaskar_Person>> getMethodName() {

          List<Haribaskar_Person> show = personService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<Haribaskar_Person>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<Haribaskar_Person>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/person/byAge")
     public List<Haribaskar_Person> custom(@RequestParam int byAge) {
          return personService.findByAge(byAge);

     }
}