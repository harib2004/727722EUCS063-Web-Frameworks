package com.example.haribaskarcw2.Haribaskar_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.haribaskarcw2.Haribaskar_model.Haribaskar_Door;
import com.example.haribaskarcw2.Haribaskar_repository.Haribaskar_DoorRepo;

@Service
public class Haribaskar_DoorService {
    @Autowired
    private Haribaskar_DoorRepo rep;

    public boolean post(Haribaskar_Door door)
    {
        try
        {
            rep.save(door);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<Haribaskar_Door> getAll()
    {
        return rep.findAll();
    }

    public List<Haribaskar_Door> getbyDoorId(int doorId)
    {
        return rep.findByDoorId(doorId);
    }
    public List<Haribaskar_Door> getbyType(String type)
    {
        return rep.findByAccessType(type);
    }
    
}
