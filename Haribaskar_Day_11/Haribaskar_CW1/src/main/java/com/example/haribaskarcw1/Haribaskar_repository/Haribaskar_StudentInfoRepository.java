package com.example.haribaskarcw1.Haribaskar_repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirection.model.StudentInfo;

@Repository
public interface Haribaskar_StudentInfoRepository extends JpaRepository<Haribaskar_StudentInfo, Integer> {

}