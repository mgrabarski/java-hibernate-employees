package com.grabarski.mateusz.database.dao.employee;

import com.grabarski.mateusz.database.dao.EmployeeDAO;
import com.grabarski.mateusz.database.session.SessionFactoryProvider;
import com.grabarski.mateusz.domain.models.Employee;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 * Created by Mateusz Grabarski on 22.07.2018.
 */
public class EmployeeMySqlDAO implements EmployeeDAO {

    private SessionFactoryProvider sessionFactoryProvider;

    public EmployeeMySqlDAO(SessionFactoryProvider sessionFactoryProvider) {
        this.sessionFactoryProvider = sessionFactoryProvider;
    }

    @Override
    public void insert(Employee employee) {
        Session session = sessionFactoryProvider.getSession();
        Transaction transaction = session.beginTransaction();

        session.save(employee);
        transaction.commit();

        sessionFactoryProvider.close();
    }

    @Override
    public void update(Employee employee) {
        Session session = sessionFactoryProvider.getSession();
        Transaction transaction = session.beginTransaction();

        session.update(employee);
        transaction.commit();

        sessionFactoryProvider.close();
    }

    @Override
    public void delete(Employee employee) {
        Session session = sessionFactoryProvider.getSession();
        Transaction transaction = session.beginTransaction();

        session.delete(employee);
        transaction.commit();

        sessionFactoryProvider.close();
    }

    @Override
    public Employee getEmployeeById(int id) {
        Session session = sessionFactoryProvider.getSession();
        Query<Employee> query = session.createQuery("FROM Employee  e WHERE e.id = :id");
        query.setParameter("id", id);

        Employee employee = query.getSingleResult();

        sessionFactoryProvider.close();

        return employee;
    }
}