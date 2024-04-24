package com.example.haribaskarcw3.Haribaskar_repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.haribaskarcw3.Haribaskar_model.Haribaskar_Village;

import java.util.List;

@Repository
public interface Haribaskar_VillageRepo extends JpaRepository<Haribaskar_Village, Integer> {

    @Query("select v from Village as v where v.villageName=?1")
    Haribaskar_Village findByName(String villageName);

    @Query("select v from Village as v where v.villageId=?1")
    Haribaskar_Village findById(int id);

    @Query("select v from Village as v where v.villagePopulation=?1")
    List<Haribaskar_Village> findByPopulation(int population);

}
