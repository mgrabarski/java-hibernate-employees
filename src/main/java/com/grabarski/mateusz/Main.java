package com.grabarski.mateusz;

import com.grabarski.mateusz.database.dao.DepartmentDAO;
import com.grabarski.mateusz.database.dao.EmployeeDAO;
import com.grabarski.mateusz.database.dao.department.DepartmentSqlDAO;
import com.grabarski.mateusz.database.dao.employee.EmployeeMySqlDAO;
import com.grabarski.mateusz.database.session.SessionFactoryProvider;
import com.grabarski.mateusz.database.session.providers.SessionSqlProvider;
import com.grabarski.mateusz.domain.models.Department;
import com.grabarski.mateusz.domain.models.Employee;

/**
 * Created by Mateusz Grabarski on 20.07.2018.
 */
public class Main {

    public static void main(String[] args) {

        SessionFactoryProvider provider = new SessionSqlProvider();
        DepartmentDAO departmentDAO = new DepartmentSqlDAO(provider);

        Department department = departmentDAO.getDepartmentById("d010");

        System.out.println(department);

        EmployeeDAO employeeDAO = new EmployeeMySqlDAO(provider);
        Employee employee = employeeDAO.getEmployeeById(600001);

        System.out.println(employee);
    }
}