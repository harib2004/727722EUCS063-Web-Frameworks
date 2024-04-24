package com.example.haribasakarcw1.Haribaskar_service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.haribasakarcw1.Haribaskar_model.Haribaskar_Person;
import com.example.haribasakarcw1.Haribaskar_repository.Haribaskar_PersonRepo;

@Service
public class Haribaskar_PersonService {
    public Haribaskar_PersonRepo personRepo;

    public Haribaskar_PersonService(Haribaskar_PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public boolean savePerson(Haribaskar_Person person) {
        try {
            personRepo.save(person);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public List<Haribaskar_Person> getPersonByAge(int age) {
        return personRepo.findByAge(age);
    }
}
