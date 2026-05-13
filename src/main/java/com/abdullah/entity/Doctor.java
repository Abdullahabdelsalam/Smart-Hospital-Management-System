package com.abdullah.entity;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("DOCTOR")
public class Doctor  extends  Person{
    private String specialization;
    private  double salary;


    public Doctor() {
    }

    public Doctor(String fullName, int age, String gender,
                  String specialization, double salary) {
        super(fullName, age, gender);
        this.specialization = specialization;
        this.salary = salary;
    }

    public String getSpecialty() {
        return specialization;
    }

    public void setSpecialty(String specialty) {
        specialization = specialty;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
