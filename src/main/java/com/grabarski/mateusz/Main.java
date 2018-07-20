package com.grabarski.mateusz;

import com.grabarski.mateusz.domain.models.Employee;
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

            Query<Employee> query = session.createQuery(" FROM Employee e");
            query.setMaxResults(10);

            query.stream().forEach(employee -> System.out.println(employee.getFirstName() + ", gender = " + employee.getGender()));
        }
    }
}