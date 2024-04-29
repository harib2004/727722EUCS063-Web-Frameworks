package com.example.haribaskarcw2.Haribaskar_repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.haribaskarcw2.Haribaskar_model.HaribaskarBook;

@Repository
public interface HaribaskarBookRepo extends JpaRepository<HaribaskarBook, Integer> {

}
