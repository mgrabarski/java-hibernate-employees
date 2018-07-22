package com.grabarski.mateusz.database.dao;

import com.grabarski.mateusz.domain.models.Employee;

/**
 * Created by Mateusz Grabarski on 22.07.2018.
 */
public interface EmployeeDAO {
    void insert(Employee employee);

    void update(Employee employee);

    void delete(Employee employee);

    Employee getEmployeeById(int id);
}
