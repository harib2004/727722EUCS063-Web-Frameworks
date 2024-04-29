package com.example.haribaskarcw1.Haribaskar_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.haribaskarcw1.Haribaskar_model.Haribaskar_Address;
import com.example.haribaskarcw1.Haribaskar_repository.Haribaskar_AddressRepo;
import com.example.haribaskarcw1.Haribaskar_repository.Haribaskar_EmployeeRepo;

@Service
public class Haribaskar_AddressService {
    @Autowired
    Haribaskar_AddressRepo addressRepo;
    @Autowired
    Haribaskar_EmployeeRepo employeeRepo;
    public Haribaskar_Address setAddressById(int id,Haribaskar_Address address)
    {
        if(employeeRepo.existsById(id))
        {
            addressRepo.setByemployeeId(address.getCity(), address.getStreet(), id);
            return address;
        }
        else
        {
            return null;
        }
    }
}
