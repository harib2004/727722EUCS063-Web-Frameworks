package com.example.haribaskarcw1.Haribaskar_repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.haribaskarcw1.Haribaskar_model.Haribaskar_Author;
@Repository
public interface Haribaskar_AuthorRepository extends JpaRepository<Haribaskar_Author, Long> {
}
