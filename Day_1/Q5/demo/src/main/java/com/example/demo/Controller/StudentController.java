package com.example.demo.Controller;

import com.example.demo.Controller.Student;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    @GetMapping("/student")

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        Student obj = new Student();
        obj.setStudentName("HB");
        obj.setMessage("Welcome, HB!");
        students.add(obj);
        return students;
    }
}
