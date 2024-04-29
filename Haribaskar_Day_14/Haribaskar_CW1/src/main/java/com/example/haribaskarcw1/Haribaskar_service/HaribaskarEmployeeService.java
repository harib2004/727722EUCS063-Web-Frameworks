package com.example.haribaskarcw1.Haribaskar_service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.haribaskarcw1.Haribaskar_model.HaribaskarEmployee;
import com.example.haribaskarcw1.Haribaskar_repository.HaribaskarEmployeeRepo;

@Service

public class HaribaskarEmployeeService {
    @Autowired
    HaribaskarEmployeeRepo employeeRepo;

    public HaribaskarEmployee addEmployee(HaribaskarEmployee employee) {
        return employeeRepo.save(employee);
    }

    public List<HaribaskarEmployee> getEmployees() {
        return employeeRepo.findAll();
    }

    public Optional<HaribaskarEmployee> getEmployee(Long employeeId) {
        return employeeRepo.findById(employeeId);
    }

}
