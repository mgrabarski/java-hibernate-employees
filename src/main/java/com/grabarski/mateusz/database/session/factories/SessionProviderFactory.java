package com.grabarski.mateusz.database.session.factories;

import com.grabarski.mateusz.database.session.SessionFactoryProvider;
import com.grabarski.mateusz.database.session.providers.SessionSqlProvider;

/**
 * Created by Mateusz Grabarski on 22.07.2018.
 */
public class SessionProviderFactory {

    public enum Provider {
        SQL
    }

    public static SessionFactoryProvider getSessionProvider(Provider provider) {

        switch (provider) {
            case SQL:
                return new SessionSqlProvider();
        }

        throw new IllegalArgumentException("Not supporting provider");
    }
}