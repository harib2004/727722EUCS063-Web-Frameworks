package com.example.haribaskarcw2.Haribaskar_model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Haribaskar_Student {
    @Id
    private int id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Haribaskar_StudentInfo studentInfo;
}
