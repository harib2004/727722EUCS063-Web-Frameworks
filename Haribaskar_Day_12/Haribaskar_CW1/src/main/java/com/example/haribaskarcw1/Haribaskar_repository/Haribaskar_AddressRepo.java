package com.example.haribaskarcw1.Haribaskar_repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.haribaskarcw1.Haribaskar_model.Haribaskar_Address;

import jakarta.transaction.Transactional;
@Repository
public interface Haribaskar_AddressRepo extends JpaRepository<Haribaskar_Address,Integer>{

    @Modifying
    @Transactional
    @Query(value="insert into address(city,street,employee_id) values(?1,?2,?3)",nativeQuery = true)
    void setByemployeeId(String city,String street,int id);
     
}
