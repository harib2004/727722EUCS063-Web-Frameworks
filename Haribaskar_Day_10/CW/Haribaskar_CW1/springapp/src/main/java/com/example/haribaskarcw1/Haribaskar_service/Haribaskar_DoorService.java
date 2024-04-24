package com.example.haribaskarcw1.Haribaskar_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.haribaskarcw1.Haribaskar_model.Haribaskar_Door;
import com.example.haribaskarcw1.Haribaskar_repository.Haribaskar_DoorRepo;

@Service
public class Haribaskar_DoorService {
    @Autowired
    private Haribaskar_DoorRepo doorRepo;

    public Haribaskar_Door postData(Haribaskar_Door door) {
        return doorRepo.save(door);
    }

    public List<Haribaskar_Door> getBycolor(String color) {
        return doorRepo.findByColor(color);
    }

    public Haribaskar_Door updateDetail(int doorid, Haribaskar_Door door) {
        return doorRepo.save(door);
    }

    public boolean deleteDoor(int doorid) {
        doorRepo.deleteById(doorid);
        return true;
    }

    public List<Haribaskar_Door> getByDoorType(String doortype) {
        return doorRepo.findByDoorType(doortype);
    }

    public List<Haribaskar_Door> getAllDetails() {

        return doorRepo.findAll();
    }

    public Haribaskar_Door getDetailsById(int doorid) {
        return doorRepo.findById(doorid).orElse(null);
    }

}