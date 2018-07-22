package com.grabarski.mateusz;

import com.grabarski.mateusz.domain.models.DepartmentManager;
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

            Query<DepartmentManager> query = session.createQuery(" FROM DepartmentManager dm ");

            query.stream().forEach(departmentManager -> System.out.println(departmentManager.getFromDate() + ", " + departmentManager.getToDate()));
        }
    }
}