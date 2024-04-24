package com.example.haribaskarcw2.Haribaskar_servicevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.haribaskarcw2.model.Recipe;
import com.example.haribaskarcw2.repository.RecipeRepo;

@Service
public class Haribaskar_RecipeService {
    @Autowired
    private RecipeRepo rep;

  
    @SuppressWarnings("null")
    public boolean post(Haribaskar_Recipe recipe)
    {
        try
        {
            rep.save(recipe);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public Haribaskar_Recipe getByid(int id)
    {
        return rep.findById(id).orElse(null);
    }

    public List<Haribaskar_Recipe> filter(String name)
    {
        return rep.findByProduct(name);
    }
    
    
}
