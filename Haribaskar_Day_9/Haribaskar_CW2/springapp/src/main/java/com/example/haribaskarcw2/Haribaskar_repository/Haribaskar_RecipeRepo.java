package com.example.haribaskarcw2.Haribaskar_repositorytory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.haribaskarcw2.model.Recipe;

import java.util.List;

Haribaskar_Recipe,Integer>{

    @Query("select r from Recipe r where recipeName=?1")
    List<Haribaskar_Recipe
    @Query("select r from Recipe r where recipeName=?1")
    List<Recipe> findByProduct(String name);
    
}
