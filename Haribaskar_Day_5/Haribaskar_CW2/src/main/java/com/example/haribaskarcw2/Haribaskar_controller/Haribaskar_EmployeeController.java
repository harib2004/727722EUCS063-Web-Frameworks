package com.example.haribaskarcw2.Haribaskar_controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.haribaskarcw2.Haribaskar_model.Haribaskar_Employee;
import com.example.haribaskarcw2.Haribaskar_service.Haribaskar_EmployeeService;

@RestController
public class Haribaskar_EmployeeController {
    public Haribaskar_EmployeeService employeeService;
    public Haribaskar_EmployeeController( Haribaskar_EmployeeService employeeService)
    {
        this.employeeService=employeeService;
    }
    @PostMapping("/api/employee")
    public ResponseEntity<Haribaskar_Employee> postMethodName(@RequestBody Haribaskar_Employee employee) {
        if(employeeService.saveEmployee(employee) == true)
        {
            return new ResponseEntity<>(employee,HttpStatus.CREATED);
        }
        
        return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PutMapping("/api/employee/{employeeId}")
    public ResponseEntity<Haribaskar_Employee> putMethodName(@PathVariable("employeeId") int id, @RequestBody Haribaskar_Employee employee) {
        if(employeeService.updateDetails(id,employee) == true)
        {
            return new ResponseEntity<>(employee,HttpStatus.OK);
        }
        
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }
    
    @DeleteMapping("/api/employee/{employeeId}")
    public ResponseEntity<Haribaskar_Employee> delete(@PathVariable("employeeId") int id,@RequestBody Haribaskar_Employee employee)
    {
        if(employeeService.deleteEmployee(id) == true)
        {
            return new ResponseEntity<>(employee,HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }
}
