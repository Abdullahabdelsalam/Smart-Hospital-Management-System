package com.abdullah;

import com.abdullah.entity.Appointment;
import com.abdullah.entity.MedicalRecord;
import com.abdullah.entity.Patient;
import com.abdullah.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

    public static void main(String[] args) {

//        Session session = HibernateUtil.getSessionFactory().openSession();
//
//        Transaction tx = session.beginTransaction();
//
//        MedicalRecord record = new MedicalRecord(
//                "A+",
//                "Peanuts",
//                "Flu",
//                "Paracetamol"
//        );
//
//        Patient patient = new Patient(
//                "Ahmed Ali",
//                25,
//                "Male",
//                "Fever"
//        );
//
//        patient.setMedicalRecord(record);
//
//        session.persist(patient);
//
//        tx.commit();
//        session.close();
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Patient.class)
                .addAnnotatedClass(MedicalRecord.class)
                .addAnnotatedClass(Appointment.class)
                .buildSessionFactory();

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

// Medical Record
        MedicalRecord record = new MedicalRecord(
                "A+",
                "Peanuts",
                "Flu",
                "Paracetamol"
        );

// Patient
        Patient patient = new Patient(
                "Ahmed Ali",
                25,
                "Male",
                "Fever"
        );

// Appointments
        Appointment a1 = new Appointment("Dr. Smith", "2026-05-14", "Scheduled");
        Appointment a2 = new Appointment("Dr. John", "2026-05-15", "Pending");


        patient.setMedicalRecord(record);
        patient.addAppointment(a1);
        patient.addAppointment(a2);

        session.persist(patient);

        tx.commit();
        session.close();
    }
}
