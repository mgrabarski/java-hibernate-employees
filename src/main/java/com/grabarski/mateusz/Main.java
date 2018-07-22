package com.grabarski.mateusz;

import com.grabarski.mateusz.database.dao.DepartmentDAO;
import com.grabarski.mateusz.database.dao.department.DepartmentSqlDAO;
import com.grabarski.mateusz.database.session.SessionFactoryProvider;
import com.grabarski.mateusz.database.session.providers.SessionSqlProvider;
import com.grabarski.mateusz.domain.models.Department;

/**
 * Created by Mateusz Grabarski on 20.07.2018.
 */
public class Main {

    public static void main(String[] args) {

        SessionFactoryProvider provider = new SessionSqlProvider();
        DepartmentDAO departmentDAO = new DepartmentSqlDAO(provider);

        Department department = new Department();
        department.setDeptNo("d010");
        department.setDeptName("IT");

        departmentDAO.insert(department);
    }
}