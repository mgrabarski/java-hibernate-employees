package com.grabarski.mateusz;

import com.grabarski.mateusz.database.dao.EmployeeDAO;
import com.grabarski.mateusz.database.dao.employee.EmployeeMySqlDAO;
import com.grabarski.mateusz.database.session.SessionFactoryProvider;
import com.grabarski.mateusz.database.session.providers.SessionSqlProvider;
import com.grabarski.mateusz.domain.models.Employee;
import com.grabarski.mateusz.domain.models.enums.GenderEnum;

import java.sql.Date;
import java.time.LocalDate;

/**
 * Created by Mateusz Grabarski on 20.07.2018.
 */
public class Main {

    public static void main(String[] args) {

        SessionFactoryProvider provider = new SessionSqlProvider();
        EmployeeDAO employeeDAO = new EmployeeMySqlDAO(provider);

        Employee employee = new Employee();
        employee.setEmpNo(600001);
        employee.setFirstName("Mateusz");
        employee.setLastName("Grabarski");
        employee.setBirthDate(Date.valueOf(LocalDate.now()));
        employee.setGender(GenderEnum.M);
        employee.setHireDate(Date.valueOf(LocalDate.now()));

        employeeDAO.insert(employee);
    }
}