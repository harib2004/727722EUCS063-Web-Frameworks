package com.example.haribaskarcw1.Haribaskar_repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.haribaskarcw1.Haribaskar_model.HaribaskarEmployee;

@Repository
public interface HaribaskarEmployeeRepo extends JpaRepository<HaribaskarEmployee, Long> {

}
