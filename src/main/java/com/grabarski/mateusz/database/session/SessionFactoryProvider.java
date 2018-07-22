package com.grabarski.mateusz.database.session;

import org.hibernate.Session;

/**
 * Created by Mateusz Grabarski on 22.07.2018.
 */
public interface SessionFactoryProvider {

    Session getSession();

    void closeSession();
}