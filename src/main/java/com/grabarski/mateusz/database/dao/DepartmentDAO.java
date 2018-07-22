package com.grabarski.mateusz.database.dao;

import com.grabarski.mateusz.domain.models.Department;

/**
 * Created by Mateusz Grabarski on 22.07.2018.
 */
public interface DepartmentDAO {
    void insert(Department department);

    void update(Department department);

    void delete(Department department);

    Department getDepartmentById(String id);
}