package com.abdullah.dao;

import com.abdullah.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class GenericDAO<T> {

    private final Class<T> type;

    public GenericDAO(Class<T> type) {
        this.type = type;
    }

    // CREATE / UPDATE
    public void saveOrUpdate(T entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        session.merge(entity);

        tx.commit();
        session.close();
    }

    // GET BY ID
    public T getById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        T entity = session.get(type, id);
        session.close();
        return entity;
    }

    // DELETE
    public void delete(T entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        session.remove(entity);

        tx.commit();
        session.close();
    }

    // GET ALL
    public List<T> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<T> list = session.createQuery("from " + type.getSimpleName(), type).list();
        session.close();
        return list;
    }
}
