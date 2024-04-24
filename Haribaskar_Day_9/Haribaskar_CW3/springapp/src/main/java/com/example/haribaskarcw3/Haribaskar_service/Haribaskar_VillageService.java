package com.example.haribaskarcw3.Haribaskar_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.haribaskarcw3.Haribaskar_model.Haribaskar_Village;
import com.example.haribaskarcw3.Haribaskar_repository.Haribaskar_VillageRepo;

@Service
public class Haribaskar_VillageService {
    @Autowired
    private Haribaskar_VillageRepo rep;

    public boolean post(Haribaskar_Village person)
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

    public Haribaskar_Village start(String lastname)
    {
        return rep.findByName(lastname);
    }
    public Haribaskar_Village get3(int id)
    {
        return rep.findById(id);
    }

    public List<Haribaskar_Village> end(int population)
    {
        return rep.findByPopulation(population);
    }
    
}
