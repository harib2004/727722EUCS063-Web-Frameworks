package com.example.haribaskarcw2.Haribaskar_repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.haribaskarcw2.Haribaskar_model.Haribaskar_Product;

import java.util.List;


@Repository
public interface Haribaskar_ProductRepo extends JpaRepository<Haribaskar_Product,Integer>{

    List<Haribaskar_Product> findByProductNameStartingWith(String name);
    List<Haribaskar_Product> findByProductNameEndingWith(String name);
    
}
