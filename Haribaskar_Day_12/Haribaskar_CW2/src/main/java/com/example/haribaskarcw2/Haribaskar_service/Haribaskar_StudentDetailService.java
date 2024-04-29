package com.example.haribaskarcw2.Haribaskar_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.haribaskarcw2.Haribaskar_model.Haribaskar_StudentDetail;
import com.example.haribaskarcw2.Haribaskar_repository.Haribaskar_StudentDetailRepository;
import com.example.haribaskarcw2.Haribaskar_repository.Haribaskar_StudentRepository;

@Service
public class Haribaskar_StudentDetailService {
    @Autowired
    Haribaskar_StudentDetailRepository studentDetailRepository;
    @Autowired
    Haribaskar_StudentRepository studentRepository;
    public Haribaskar_StudentDetail addStudentDetail(int id,Haribaskar_StudentDetail studentDetail)
    {
        if(studentRepository.existsById(id))
        {
            studentDetailRepository.addStudentDetail(studentDetail.getAddress(),studentDetail.getPhoneNumber(),id);
            return studentDetail;
        }
        else
        return null;
    }
    
    
}
