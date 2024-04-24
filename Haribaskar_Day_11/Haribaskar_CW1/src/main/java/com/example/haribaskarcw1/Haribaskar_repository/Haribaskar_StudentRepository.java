package com.example.haribaskarcw1.Haribaskar_repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirection.model.Student;

@Repository
public interface Haribaskar_StudentRepository extends JpaRepository<Haribaskar_Student, Integer> {

}
