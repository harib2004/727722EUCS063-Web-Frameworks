package com.example.haribaskarcw2.Haribaskar_repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.haribaskarcw2.Haribaskar_model.Haribaskar_Student;

@Repository
public interface Haribaskar_StudentRepository extends JpaRepository<Haribaskar_Student,Integer>{
    
}
