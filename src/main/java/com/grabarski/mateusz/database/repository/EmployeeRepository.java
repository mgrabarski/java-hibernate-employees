package com.grabarski.mateusz.database.repository;

import com.grabarski.mateusz.database.session.SessionFactoryProvider;
import com.grabarski.mateusz.domain.models.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Created by Mateusz Grabarski on 22.07.2018.
 */
public class EmployeeRepository {

    private SessionFactoryProvider provider;

    public EmployeeRepository(SessionFactoryProvider provider) {
        this.provider = provider;
    }

    public List<Employee> getAllEmployees() {
        Session session = provider.getSession();
        Query<Employee> query = session.createQuery("FROM Employee e");

        return query.getResultList();
    }
}