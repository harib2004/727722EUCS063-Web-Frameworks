package com.example.haribaskarcw2.Haribaskar_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.haribaskarcw2.Haribaskar_model.Haribaskar_Door;
import com.example.haribaskarcw2.Haribaskar_service.Haribaskar_DoorService;

import java.util.*;

@RestController
public class Haribaskar_DoorController {
    @Autowired
    private Haribaskar_DoorService ser;
    
    @PostMapping("/api/door")
    public ResponseEntity<Haribaskar_Door> post(@RequestBody Haribaskar_Door door)
    {
        if(ser.post(door))
        {
            return new ResponseEntity<>(door,HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/door")
    public ResponseEntity<List<Haribaskar_Door>> getAll()
    {
        List<Haribaskar_Door> li = ser.getAll();
        if(li.size()>0)
        {
            return new ResponseEntity<>(li,HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/api/door/{doorId}")
    public ResponseEntity<List<Haribaskar_Door>> getbyId(@PathVariable int doorId)
    {
        List<Haribaskar_Door> li = ser.getbyDoorId(doorId);
        if(li.size()>0)
        {
            return new ResponseEntity<>(li,HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @GetMapping("/api/door/accessType/{accessType}")
    public ResponseEntity<List<Haribaskar_Door>> getbyType(@PathVariable String accessType)
    {
        List<Haribaskar_Door> li = ser.getbyType(accessType);
        if(li.size()>0)
        {
            return new ResponseEntity<>(li,HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
