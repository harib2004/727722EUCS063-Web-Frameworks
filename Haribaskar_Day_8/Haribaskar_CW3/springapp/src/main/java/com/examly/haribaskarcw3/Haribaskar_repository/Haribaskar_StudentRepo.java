package com.examly.haribaskarcw3.Haribaskar_repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.haribaskarcw3.Haribaskar_model.Haribaskar_Student;

import java.util.List;

@Repository
public interface Haribaskar_StudentRepo extends JpaRepository<Haribaskar_Student, Long> {

    List<Haribaskar_Student> findByMarksGreaterThan(int mark);

    List<Haribaskar_Student> findByMarksLessThan(int mark);

}
