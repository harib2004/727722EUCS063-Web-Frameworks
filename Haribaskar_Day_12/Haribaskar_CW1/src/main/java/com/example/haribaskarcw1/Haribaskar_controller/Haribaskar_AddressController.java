package com.example.haribaskarcw1.Haribaskar_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.haribaskarcw1.Haribaskar_model.Haribaskar_Address;
import com.example.haribaskarcw1.Haribaskar_service.Haribaskar_AddressService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class Haribaskar_AddressController {
    
    @Autowired
    Haribaskar_AddressService addressService;

    @SuppressWarnings("null")
    @PostMapping("/address/employee/{id}")
    public ResponseEntity<Haribaskar_Address> postMethodName(@RequestBody Haribaskar_Address address,@PathVariable int id) {
        
        try{
            return new ResponseEntity<>(addressService.setAddressById(id, address),HttpStatus.CREATED);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
