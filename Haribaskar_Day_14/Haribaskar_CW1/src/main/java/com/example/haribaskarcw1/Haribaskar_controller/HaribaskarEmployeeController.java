package com.example.haribaskarcw1.Haribaskar_controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.haribaskarcw1.Haribaskar_model.HaribaskarEmployee;
import com.example.haribaskarcw1.Haribaskar_service.HaribaskarEmployeeService;

import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@Tag(name = "employee controller", description = "emp controller spin")
public class HaribaskarEmployeeController {
    @Autowired
    HaribaskarEmployeeService employeeService;

    @PostMapping("/employee")
    public HaribaskarEmployee addEmployee(@RequestBody HaribaskarEmployee employee) {
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/employee")
    public List<HaribaskarEmployee> getMethodName() {
        return employeeService.getEmployees();
    }

    @GetMapping("/employee/{employeeId}")
    public Optional<HaribaskarEmployee> getMethodName(@PathVariable Long employeeId) {
        return employeeService.getEmployee(employeeId);
    }

}
