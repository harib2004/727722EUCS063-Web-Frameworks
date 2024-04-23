package com.examly.haribaskarcw3.Haribaskar_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.examly.haribaskarcw3.Haribaskar_model.Haribaskar_Course;
import com.examly.haribaskarcw3.Haribaskar_repository.Haribaskar_CourseRepo;

@Service
public class Haribaskar_CourseService {

     @Autowired
     public Haribaskar_CourseRepo courseRepo;

     public Haribaskar_Course SaveEntity(Haribaskar_Course entity) {
          return courseRepo.save(entity);

     }

     public List<Haribaskar_Course> getDetails() {
          return courseRepo.findAll();

     }

     public List<Haribaskar_Course> findByCourseName(String courseName) {
          return courseRepo.findByCourseName(courseName);
     }

}
