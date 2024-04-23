package com.example.haribaskarcw2.Haribaskar_service;

import org.springframework.stereotype.Service;

import com.example.haribaskarcw2.Haribaskar_model.Haribaskar_Employee;
import com.example.haribaskarcw2.Haribaskar_repository.Haribaskar_EmployeeRepo;

@Service
public class Haribaskar_EmployeeService {
    public Haribaskar_EmployeeRepo employeeRepo;
    public Haribaskar_EmployeeService(Haribaskar_EmployeeRepo employeeRepo)
    {
        this.employeeRepo = employeeRepo;
    }
    public boolean saveEmployee(Haribaskar_Employee employee)
    {
        try
        {
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,Haribaskar_Employee employee)
    {
        if(this.getEmployeeById(id)==null)
        {
            return false;
        }
        try{
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteEmployee(int id)
    {
        if(this.getEmployeeById(id) == null)
        {
            return false;
        }
        employeeRepo.deleteById(id);
        return true;
    }
    public Haribaskar_Employee getEmployeeById(int id)
    {
        return employeeRepo.findById(id).orElse(null);
    }
}
