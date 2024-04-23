package com.example.haribaskarcw2.Haribaskar_repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.haribaskarcw2.Haribaskar_model.Haribaskar_Door;

import java.util.List;

@Repository
public interface Haribaskar_DoorRepo extends JpaRepository<Haribaskar_Door,Integer>{

    List<Haribaskar_Door> findByDoorId(int doorId);
    List<Haribaskar_Door> findByAccessType(String accessType);
    
}
