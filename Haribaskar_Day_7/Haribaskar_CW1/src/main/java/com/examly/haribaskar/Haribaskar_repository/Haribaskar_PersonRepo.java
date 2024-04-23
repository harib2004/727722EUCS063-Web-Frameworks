package com.examly.haribaskar.Haribaskar_repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.haribaskar.*;
import com.examly.haribaskar.Haribaskar_model.Haribaskar_Person;

/**
 * PersonRepo
 */
@Repository
public interface Haribaskar_PersonRepo extends JpaRepository<Haribaskar_Person, Integer> {

     List<Haribaskar_Person> findByAge(int byAge);
}