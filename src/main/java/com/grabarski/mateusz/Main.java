package com.grabarski.mateusz;

import com.grabarski.mateusz.database.dao.DepartmentDAO;
import com.grabarski.mateusz.database.dao.EmployeeDAO;
import com.grabarski.mateusz.database.dao.department.DepartmentSqlDAO;
import com.grabarski.mateusz.database.dao.employee.EmployeeMySqlDAO;
import com.grabarski.mateusz.database.repository.EmployeeRepository;
import com.grabarski.mateusz.database.session.SessionFactoryProvider;
import com.grabarski.mateusz.database.session.factories.SessionProviderFactory;
import com.grabarski.mateusz.domain.models.*;

import java.util.List;

/**
 * Created by Mateusz Grabarski on 20.07.2018.
 */
public class Main {

    public static void main(String[] args) {

        SessionFactoryProvider provider = SessionProviderFactory.getSessionProvider(SessionProviderFactory.Provider.SQL);
        DepartmentDAO departmentDAO = new DepartmentSqlDAO(provider);

        Department department = departmentDAO.getDepartmentById("d010");

        System.out.println(department);

        EmployeeDAO employeeDAO = new EmployeeMySqlDAO(provider);
        Employee employee = employeeDAO.getEmployeeById(10001);

        printEmployee(employee);

        System.out.println("\n\n\n");

        EmployeeRepository employeeRepository = new EmployeeRepository(provider);
        System.out.println("Number of employees in database: " + employeeRepository.getAllEmployees().size());

        provider.closeSession();
    }

    private static void printEmployee(Employee employee) {
        StringBuilder builder = new StringBuilder();
        builder.append("First name: " + employee.getFirstName());
        builder.append("\nLast name: " + employee.getLastName());
        builder.append("\nBirth date: " + employee.getBirthDate());
        builder.append("\nGender: " + employee.getGender());
        builder.append("\nTitles: " + getTitles(employee.getTitles()));
        builder.append("\nSalaries: " + getSalaries(employee.getSalaries()));
        builder.append("\nDepartments: " + getDepartments(employee.getDepartments()));

        System.out.println(builder.toString());
    }

    private static String getTitles(List<Title> titles) {
        StringBuilder builder = new StringBuilder();
        titles.forEach(title -> builder.append(title.getId().getTitle()).append(", "));
        return builder.toString();
    }

    private static String getSalaries(List<Salary> salaries) {
        StringBuilder builder = new StringBuilder();
        salaries.forEach(salary -> builder.append(salary.getSalary()).append(", "));
        return builder.toString();
    }

    private static String getDepartments(List<DepartmentEmployee> departments) {
        StringBuilder builder = new StringBuilder();
        departments.forEach(departmentEmployee -> builder.append(departmentEmployee.getDepartment().getDeptName()).append(","));
        return builder.toString();
    }
}