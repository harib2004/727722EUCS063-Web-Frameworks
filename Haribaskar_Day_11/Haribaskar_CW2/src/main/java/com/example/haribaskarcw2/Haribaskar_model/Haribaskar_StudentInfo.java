package com.example.haribaskarcw2.Haribaskar_model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Haribaskar_StudentInfo {
    @Id
    private int id;
    private String address;
    private String phNo;
}
