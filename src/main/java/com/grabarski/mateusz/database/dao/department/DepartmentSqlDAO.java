package com.grabarski.mateusz.database.dao.department;

import com.grabarski.mateusz.database.dao.DepartmentDAO;
import com.grabarski.mateusz.database.session.SessionFactoryProvider;
import com.grabarski.mateusz.domain.models.Department;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 * Created by Mateusz Grabarski on 22.07.2018.
 */
public class DepartmentSqlDAO implements DepartmentDAO {

    private SessionFactoryProvider sessionFactoryProvider;

    public DepartmentSqlDAO(SessionFactoryProvider sessionFactoryProvider) {
        this.sessionFactoryProvider = sessionFactoryProvider;
    }

    @Override
    public void insert(Department department) {
        Session session = sessionFactoryProvider.getSession();

        Transaction transaction = session.beginTransaction();
        session.save(department);

        transaction.commit();

        sessionFactoryProvider.close();
    }

    @Override
    public void update(Department department) {
        Session session = sessionFactoryProvider.getSession();

        Transaction transaction = session.beginTransaction();
        session.update(department);

        transaction.commit();

        sessionFactoryProvider.close();
    }

    @Override
    public void delete(Department department) {
        Session session = sessionFactoryProvider.getSession();

        Transaction transaction = session.beginTransaction();
        session.delete(department);

        transaction.commit();

        sessionFactoryProvider.close();
    }

    @Override
    public Department getDepartmentById(String id) {
        Session session = sessionFactoryProvider.getSession();
        Query<Department> query = session.createQuery("FROM Department d WHERE d.id =:id");
        query.setParameter("id", id);

        Department department = query.getSingleResult();

        sessionFactoryProvider.close();

        return department;
    }
}