package com.abdullah.entity;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("PATIENT")
public class Patient extends Person {

    private String disease;

    public Patient() {
    }

    public Patient(String fullName, int age, String gender,
                   String disease) {
        super(fullName, age, gender);
        this.disease = disease;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
}
