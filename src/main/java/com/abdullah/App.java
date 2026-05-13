package com.abdullah;

import com.abdullah.entity.MedicalRecord;
import com.abdullah.entity.Patient;
import com.abdullah.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();

        MedicalRecord record = new MedicalRecord(
                "A+",
                "Peanuts",
                "Flu",
                "Paracetamol"
        );

        Patient patient = new Patient(
                "Ahmed Ali",
                25,
                "Male",
                "Fever"
        );

        patient.setMedicalRecord(record);

        session.persist(patient);

        tx.commit();
        session.close();

        System.out.println("DONE ✔");
    }
}
