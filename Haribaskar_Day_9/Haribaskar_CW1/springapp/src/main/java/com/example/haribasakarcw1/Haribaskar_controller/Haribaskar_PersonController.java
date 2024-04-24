package com.example.haribasakarcw1.Haribaskar_controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.haribasakarcw1.Haribaskar_model.Haribaskar_Person;
import com.example.haribasakarcw1.Haribaskar_service.Haribaskar_PersonService;

@RestController
public class Haribaskar_PersonController {
    public Haribaskar_PersonService personService;

    public Haribaskar_PersonController(Haribaskar_PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/api/person")
    public ResponseEntity<Haribaskar_Person> postMethodName(@RequestBody Haribaskar_Person person) {
        if (personService.savePerson(person)) {
            return new ResponseEntity<>(person, HttpStatus.CREATED);
        }
        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/api/person/byage/{age}")
    public ResponseEntity<List<Haribaskar_Person>> getMethodName(@PathVariable("age") int age) {
        List<Haribaskar_Person> list = personService.getPersonByAge(age);
        if (list.size() == 0) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
