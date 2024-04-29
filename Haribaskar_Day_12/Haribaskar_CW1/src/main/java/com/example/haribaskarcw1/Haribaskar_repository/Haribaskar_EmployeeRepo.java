package com.example.haribaskarcw1.Haribaskar_repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.haribaskarcw1.Haribaskar_model.Haribaskar_Employee;

public interface Haribaskar_EmployeeRepo extends JpaRepository<Haribaskar_Employee,Integer> {
 
    @Query(value = "SELECT e.* FROM employee e INNER JOIN address a ON e.id = a.employee_id",nativeQuery = true)
    List<Haribaskar_Employee> getByInnerEmployees();

    @Query(value = "SELECT e.* FROM employee e LEFT JOIN address a ON e.id = a.employee_id",nativeQuery = true)
    List<Haribaskar_Employee> getByLeftOuterEmployees();
}