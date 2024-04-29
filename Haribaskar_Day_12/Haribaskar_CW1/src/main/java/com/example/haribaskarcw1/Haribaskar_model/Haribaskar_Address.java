package com.example.haribaskarcw1.Haribaskar_model;

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
@Table(name="address")
public class Haribaskar_Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String city;
    String street;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id",referencedColumnName = "id")
    @JsonBackReference
    Haribaskar_Employee employee;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public Haribaskar_Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Haribaskar_Employee employee) {
        this.employee = employee;
    }
    
    
}
