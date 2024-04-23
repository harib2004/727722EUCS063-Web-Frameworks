package com.example.haribaskarcw.Haribaskar_repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springapp.model.Person;
import java.util.List;


@Repository
public interface Haribaskar_PersonRepo extends JpaRepository<Haribaskar_Person,Integer>{

    List<Haribaskar_Person> findByNameStartingWith(String name);
    List<Haribaskar_Person> findByNameEndingWith(String name);
    
}
