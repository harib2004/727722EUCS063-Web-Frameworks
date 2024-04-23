package com.example.haribaskarcw.Haribaskar_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.Person;
import com.example.springapp.repository.PersonRepo;

@Service
public class Haribaskar_PersonService {
    @Autowired
    private Haribaskar_PersonRepo rep;

    public boolean post(Haribaskar_Person person)
    {
        try
        {
            rep.save(person);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<Haribaskar_Person> start(String value)
    {
        return rep.findByNameStartingWith(value);
    }

    public List<Haribaskar_Person> end(String value)
    {
        return rep.findByNameEndingWith(value);
    }
    
}
