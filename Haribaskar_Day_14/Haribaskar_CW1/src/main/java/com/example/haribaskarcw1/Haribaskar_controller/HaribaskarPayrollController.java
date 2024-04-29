package com.example.haribaskarcw1.Haribaskar_controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.haribaskarcw1.Haribaskar_model.HaribaskarPayroll;
import com.example.haribaskarcw1.Haribaskar_service.HaribaskarPayrollService;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class HaribaskarPayrollController {
    @Autowired
    HaribaskarPayrollService PayrollService;

    @PutMapping("/employee/{employeeId}/payroll")
    public HaribaskarPayroll addPayroll(@PathVariable Long employeeId, @RequestBody HaribaskarPayroll payroll) {
        return PayrollService.addPayroll(employeeId, payroll);
    }

    @GetMapping("/employee/{employeeId}/payroll")
    public Optional<HaribaskarPayroll> getMethodName(@PathVariable Long employeeId) {
        return PayrollService.getPayroll(employeeId);
    }

}
