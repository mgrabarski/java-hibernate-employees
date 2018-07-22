package com.grabarski.mateusz.database.session.providers;

import com.grabarski.mateusz.database.session.SessionFactoryProvider;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by Mateusz Grabarski on 22.07.2018.
 */
public class SessionSqlProvider implements SessionFactoryProvider {

    private SessionFactory sessionFactory;

    public SessionSqlProvider() {
        this.sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    @Override
    public Session getSession() {
        if (sessionFactory.isClosed()) {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        }
        return sessionFactory.openSession();
    }

    @Override
    public void closeSession() {
        sessionFactory.close();
    }
}