package com.example.haribaskarcw1.Haribaskar_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.haribaskarcw1.Haribaskar_model.Haribaskar_Door;
import com.example.haribaskarcw1.Haribaskar_service.Haribaskar_DoorService;

import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api")
public class Haribaskar_DoorController {

    @Autowired
    public Haribaskar_DoorService doorService;

    @PostMapping("/door")
    public ResponseEntity<Haribaskar_Door> postData(@RequestBody Haribaskar_Door door) {
        Haribaskar_Door doorData = doorService.postData(door);
        if (doorData != null) {
            return new ResponseEntity<>(doorData, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @GetMapping("door/bycolor/{color}")
    public ResponseEntity<List<Haribaskar_Door>> getBycolor(@PathVariable String color) {
        List<Haribaskar_Door> door = doorService.getBycolor(color);
        if (door != null) {
            return new ResponseEntity<>(door, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @PutMapping("door/{doorid}")
    public ResponseEntity<Haribaskar_Door> updateDetailResponseEntity(@PathVariable int doorid,
            @RequestBody Haribaskar_Door door) {
        Haribaskar_Door doorData = doorService.updateDetail(doorid, door);
        if (doorData != null) {
            return new ResponseEntity<>(doorData, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("door/{doorid}")
    public ResponseEntity<String> deleteDoor(@PathVariable int doorid) {
        if (doorService.deleteDoor(doorid)) {
            return new ResponseEntity<>("Door deleted successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/door/bydoortype/{doortype}")
    public ResponseEntity<List<Haribaskar_Door>> getByDoor(@PathVariable String doortype) {
        List<Haribaskar_Door> door = doorService.getByDoorType(doortype);
        if (door != null) {
            return new ResponseEntity<>(door, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/door")
    public ResponseEntity<List<Haribaskar_Door>> getAllDetails() {
        List<Haribaskar_Door> door = doorService.getAllDetails();
        if (door != null) {

            return new ResponseEntity<>(door, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }

    @GetMapping("/door/{doorid}")
    public ResponseEntity<Haribaskar_Door> getDetailsById(@PathVariable int doorid) {
        Haribaskar_Door door = doorService.getDetailsById(doorid);
        if (door != null) {
            return new ResponseEntity<>(door, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}