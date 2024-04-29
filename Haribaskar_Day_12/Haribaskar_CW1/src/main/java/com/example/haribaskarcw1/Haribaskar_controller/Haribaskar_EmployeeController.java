package com.example.haribaskarcw1.Haribaskar_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.haribaskarcw1.Haribaskar_model.Haribaskar_Employee;
import com.example.haribaskarcw1.Haribaskar_service.Haribaskar_EmployeeService;

@RestController
public class Haribaskar_EmployeeController {
    @Autowired
    Haribaskar_EmployeeService employeeService;

    @PostMapping("/employee")
    public Haribaskar_Employee setMethod(@RequestBody Haribaskar_Employee employee)
    {
        return employeeService.setEmployee(employee);
    }

    @GetMapping("/employees-inner-join")
    public List<Haribaskar_Employee> getInnerMethod()
    {
        return employeeService.getInnerEmployee();
    }

    @GetMapping("/employees-left-outer-join")
    public List<Haribaskar_Employee> getLeftMethod()
    {
        return employeeService.getLeftOuterEmployee();
    }
}
