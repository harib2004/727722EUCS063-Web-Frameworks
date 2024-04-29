package com.example.haribaskarcw2.Haribaskar_model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="studentDetail")
public class Haribaskar_StudentDetail {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;
    String address;
    String phoneNumber;
    @OneToOne(cascade=CascadeType.ALL ,fetch=FetchType.LAZY)
    @JoinColumn(name="student_id",referencedColumnName = "id")
    @JsonBackReference
    Haribaskar_Student student;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Haribaskar_Student getStudent() {
        return student;
    }
    public void setStudent(Haribaskar_Student student) {
        this.student = student;
    }
    
    
}
