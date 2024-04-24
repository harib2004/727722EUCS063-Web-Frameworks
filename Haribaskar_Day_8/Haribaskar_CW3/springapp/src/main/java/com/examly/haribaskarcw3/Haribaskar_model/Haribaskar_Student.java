package com.examly.haribaskarcw3.Haribaskar_model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Haribaskar_Student {
    @Id
    private long id;
    private String name;
    private int marks;

    public Haribaskar_Student() {
    }

    public Haribaskar_Student(long id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

}
