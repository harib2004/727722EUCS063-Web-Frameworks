package com.example.haribaskarcw1.Haribaskar_repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.haribaskarcw1.Haribaskar_model.Haribaskar_Book;
@Repository
public interface Haribaskar_BookRepository extends JpaRepository<Haribaskar_Book, Long> {
}
