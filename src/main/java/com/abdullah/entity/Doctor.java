package com.abdullah.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@DiscriminatorValue("DOCTOR")
public class Doctor  extends  Person{


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "doctor_specialization",
            joinColumns = @JoinColumn(name = "doctor_id"),
            inverseJoinColumns = @JoinColumn(name = "specialization_id")
    )
    private List<Specialization> specializations  = new ArrayList<>();
    private  double salary;

    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
    private List<Patient> patients = new ArrayList<>();


    public Doctor() {
    }

    public Doctor(String fullName, int age, String gender,
                   double salary) {
        super(fullName, age, gender);
        this.salary = salary;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public List<Specialization> getSpecialization() {
        return specializations ;
    }

    public void setSpecialization(List<Specialization> specialization) {
        this.specializations  = specializations ;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
