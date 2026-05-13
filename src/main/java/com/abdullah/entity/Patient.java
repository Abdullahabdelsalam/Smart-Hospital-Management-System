package com.abdullah.entity;


import jakarta.persistence.*;

@Entity
@DiscriminatorValue("PATIENT")
public class Patient extends Person {

    private String disease;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "medical_record_id")
    private MedicalRecord medicalRecord;

    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

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
