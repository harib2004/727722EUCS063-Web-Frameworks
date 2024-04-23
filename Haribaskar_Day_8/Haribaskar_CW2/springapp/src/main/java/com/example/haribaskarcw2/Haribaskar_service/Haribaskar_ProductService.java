package com.example.haribaskarcw2.Haribaskar_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.haribaskarcw2.Haribaskar_model.Haribaskar_Product;
import com.example.haribaskarcw2.Haribaskar_repository.Haribaskar_ProductRepo;

@Service
public class Haribaskar_ProductService {
    @Autowired
    private Haribaskar_ProductRepo rep;

    @SuppressWarnings("null")
    public boolean post(Haribaskar_Product person)
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

    public List<Haribaskar_Product> start(String value)
    {
        return rep.findByProductNameStartingWith(value);
    }

    public List<Haribaskar_Product> end(String value)
    {
        return rep.findByProductNameEndingWith(value);
    }
    public List<Haribaskar_Product> sort()
    {
        return rep.findAll(Sort.by("price"));
    }
    
}
