package com.example.haribaskarcw1.Haribaskar_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.haribaskarcw1.Haribaskar_model.Haribaskar_Employee;
import com.example.haribaskarcw1.Haribaskar_repository.Haribaskar_EmployeeRepo;

@Service
public class Haribaskar_EmployeeService {
    @Autowired
    Haribaskar_EmployeeRepo employeeRepo;

    @SuppressWarnings("null")
    public Haribaskar_Employee setEmployee(Haribaskar_Employee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<Haribaskar_Employee> getInnerEmployee()
    {
        return employeeRepo.getByInnerEmployees();
    }

    public List<Haribaskar_Employee> getLeftOuterEmployee()
    {
        return employeeRepo.getByLeftOuterEmployees();
    }
}
