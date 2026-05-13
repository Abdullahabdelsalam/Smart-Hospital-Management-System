package com.abdullah.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "medical_record")
public class MedicalRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String bloodType;

    private String allergies;

    private String diagnosis;

    private String prescription;

    @OneToOne(mappedBy = "medicalRecord")
    private Patient patient;


    public MedicalRecord() {
    }

    public MedicalRecord(String bloodType, String allergies, String diagnosis, String prescription) {
        this.bloodType = bloodType;
        this.allergies = allergies;
        this.diagnosis = diagnosis;
        this.prescription = prescription;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
