package com.example.haribaskarcw2.Haribaskar_repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.haribaskarcw2.Haribaskar_model.Haribaskar_StudentDetail;

import jakarta.transaction.Transactional;
@Repository
public interface Haribaskar_StudentDetailRepository extends JpaRepository<Haribaskar_StudentDetail,Integer>{
   @Modifying
   @Transactional
   @Query(value="insert into student_detail(address,phone_number,student_id) values (?1,?2,?3)",nativeQuery=true) 
    void addStudentDetail(String address,String phoneNumber,int id);

    
}
