package com.dinodelivery.project.repository;

import com.dinodelivery.project.object.Order;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {
    private final SessionFactory sessionFactory;

    @Autowired
    public OrderRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Order getOrderById(Integer id) {
        Session session;
        try {
            session = sessionFactory.getCurrentSession();
        } catch (HibernateException e) {
            session = sessionFactory.openSession();
        }

        return (Order) session
                .createQuery("select * from restaurant where id = :id")
                .setParameter("Id", id).uniqueResult();
    }
}
