package com.grabarski.mateusz;

import com.grabarski.mateusz.domain.models.Title;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/**
 * Created by Mateusz Grabarski on 20.07.2018.
 */
public class Main {

    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure().buildSessionFactory();
             Session session = factory.openSession()) {

            Query<Title> query = session.createQuery(" FROM Title t");
            query.setMaxResults(10);

            query.stream().forEach(title -> System.out.println(title.getFromDate()));
        }
    }
}