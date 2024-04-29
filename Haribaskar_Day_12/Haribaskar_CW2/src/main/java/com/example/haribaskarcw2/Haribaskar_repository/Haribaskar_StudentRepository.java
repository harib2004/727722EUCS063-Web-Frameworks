package com.example.haribaskarcw2.Haribaskar_repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.haribaskarcw2.Haribaskar_model.Haribaskar_Student;
@Repository
public interface Haribaskar_StudentRepository extends JpaRepository<Haribaskar_Student,Integer>{
  
    @Query(value="select s.* from student s inner join student_detail st on s.id=st.student_id",nativeQuery = true)
    List<Haribaskar_Student>getStudentInner();

    @Query(value="select s.* from student s left outer join student_detail st on s.id=st.student_id",nativeQuery = true)
    List<Haribaskar_Student> getStudentsLeftOuter();

    

    
}
