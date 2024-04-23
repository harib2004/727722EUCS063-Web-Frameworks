package com.examly.haribaskarcw3.Haribaskar_repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.haribaskarcw3.Haribaskar_model.Haribaskar_Course;

@Repository
public interface Haribaskar_CourseRepo extends JpaRepository<Haribaskar_Course, Integer> {

     List<Haribaskar_Course> findByCourseName(String courseName);

}