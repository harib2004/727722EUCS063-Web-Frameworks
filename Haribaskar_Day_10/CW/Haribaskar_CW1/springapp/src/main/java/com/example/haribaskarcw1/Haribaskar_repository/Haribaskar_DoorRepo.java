package com.example.haribaskarcw1.Haribaskar_repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.haribaskarcw1.Haribaskar_model.Haribaskar_Door;

// import jakarta.transaction.Transactiona

@Repository
public interface Haribaskar_DoorRepo extends JpaRepository<Haribaskar_Door, Integer> {

    @Query(value = "DELETE FROM Door WHERE Door_id = ?1", nativeQuery = true)
    void deleteDoor(int DoorId);

    public List<Haribaskar_Door> findByColor(String color);

    public List<Haribaskar_Door> findByDoorType(String doortype);
}
