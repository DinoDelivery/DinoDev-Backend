package com.dinodelivery.project.repository;

import com.dinodelivery.project.object.Dish;
import com.dinodelivery.project.object.Restaurant;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RestaurantRepository {
    private final SessionFactory sessionFactory;

    @Autowired
    public RestaurantRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Restaurant getRestaurantById(Integer id) {
        Session session;
        try {
            session = sessionFactory.getCurrentSession();
        } catch (HibernateException e) {
            session = sessionFactory.openSession();
        }
        return (Restaurant) session
                .createQuery("select * from restaurant where name = :name")
                .setParameter("Id", id).uniqueResult();
    }

    public Dish getDishesByRestaurantId(Integer resId) {
        Session session;
        try {
            session = sessionFactory.getCurrentSession();
        } catch (HibernateException e) {
            session = sessionFactory.openSession();
        }
        return (Dish) session
                .createQuery("select * from dish d join dish_restaurant dr on d.id=dr.dish_id join restaurant r on r.id=dr.restaurant_id where r.id = res_id")
                .setParameter("res_id", resId);
    }
}
