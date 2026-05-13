package com.abdullah;

import com.abdullah.entity.*;
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
//        SessionFactory factory = new Configuration()
//                .configure("hibernate.cfg.xml")
//                .addAnnotatedClass(Patient.class)
//                .addAnnotatedClass(MedicalRecord.class)
//                .addAnnotatedClass(Appointment.class)
//                .buildSessionFactory();
//
//        Session session = factory.openSession();
//        Transaction tx = session.beginTransaction();
//
//// Medical Record
//        MedicalRecord record = new MedicalRecord(
//                "A+",
//                "Peanuts",
//                "Flu",
//                "Paracetamol"
//        );
//
//// Patient
//        Patient patient = new Patient(
//                "Ahmed Ali",
//                25,
//                "Male",
//                "Fever"
//        );
//
//// Appointments
//        Appointment a1 = new Appointment("Dr. Smith", "2026-05-14", "Scheduled");
//        Appointment a2 = new Appointment("Dr. John", "2026-05-15", "Pending");
//
//
//        patient.setMedicalRecord(record);
//        patient.addAppointment(a1);
//        patient.addAppointment(a2);
//
//        session.persist(patient);
//
//        tx.commit();
//        session.close();

//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Transaction tx = session.beginTransaction();
//
//
//        Doctor doctor = new Doctor("Dr Ahmed", 40, "Male", 25000);
//
//        Specialization s1 = new Specialization("Cardiology");
//        Specialization s2 = new Specialization("Neurology");
//
//
//        Patient p1 = new Patient("Ali", 25, "Male", "Flu");
//        Patient p2 = new Patient("Mona", 30, "Female", "Cold");
//
//
//        doctor.getSpecialization().add(s1);
//        doctor.getSpecialization().add(s2);
//
//        p1.setDoctor(doctor);
//        p2.setDoctor(doctor);
//
//        doctor.getPatients().add(p1);
//        doctor.getPatients().add(p2);
//
//        session.persist(doctor);
//
//        tx.commit();
//        session.close();
//
//        System.out.println("Doctor Test Saved Successfully ✔");
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Transaction tx = session.beginTransaction();
//
//        Doctor doctor = new Doctor("Ahmed Samy", 40, "Male", 20000);
//
//        Appointment a1 = new Appointment("2026-05-20", "10:00", "BOOKED");
//        Appointment a2 = new Appointment("2026-05-21", "12:00", "BOOKED");
//
//        a1.setDoctor(doctor);
//        a2.setDoctor(doctor);
//
//        doctor.getAppointments().add(a1);
//        doctor.getAppointments().add(a2);
//
//        session.persist(doctor);
//
//        tx.commit();
//        session.close();
//
//        System.out.println("Step 6 Done ✔");

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

// Department
        Department dept = new Department("Cardiology");

// Doctors
        Doctor d1 = new Doctor("Ahmed", 35, "Male", 15000);
        Doctor d2 = new Doctor("Sara", 30, "Female", 14000);

// ربط الدكاترة بالقسم
        dept.addDoctor(d1);
        dept.addDoctor(d2);

// حفظ
        session.persist(dept);

        session.getTransaction().commit();
        session.close();

        System.out.println("Department with Doctors Saved ✔");
    }
}
