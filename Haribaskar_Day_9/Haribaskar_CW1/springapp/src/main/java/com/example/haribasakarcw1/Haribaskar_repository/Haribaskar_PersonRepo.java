package com.example.haribasakarcw1.Haribaskar_repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.haribasakarcw1.Haribaskar_model.Haribaskar_Person;

public interface Haribaskar_PersonRepo extends JpaRepository<Haribaskar_Person, Integer> {
    @Query("SELECT p FROM Person p WHERE age=?1")
    List<Haribaskar_Person> findByAge(int age);
}
