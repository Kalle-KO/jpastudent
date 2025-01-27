package org.example.jpastudenf24b.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private LocalDate bornDate;
    private LocalTime bornTime;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBornDate() {
        return bornDate;
    }

    public LocalTime getBornTime() {
        return bornTime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBornDate(LocalDate bornDate) {
        this.bornDate = bornDate;
    }

    public void setBornTime(LocalTime bornTime) {
        this.bornTime = bornTime;
    }
}
