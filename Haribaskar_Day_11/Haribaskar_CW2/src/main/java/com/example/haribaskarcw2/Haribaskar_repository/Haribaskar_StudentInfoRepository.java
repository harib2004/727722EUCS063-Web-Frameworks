package com.example.haribaskarcw2.Haribaskar_repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.haribaskarcw2.Haribaskar_model.Haribaskar_StudentInfo;

@Repository
public interface Haribaskar_StudentInfoRepository extends JpaRepository<Haribaskar_StudentInfo,Integer>{
    
}