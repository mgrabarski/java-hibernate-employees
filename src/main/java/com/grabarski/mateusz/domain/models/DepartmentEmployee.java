package com.grabarski.mateusz.domain.models;

import com.grabarski.mateusz.domain.models.keys.DepartmentEmployeePrimaryKey;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Mateusz Grabarski on 20.07.2018.
 */
@Entity
@Table(name = "dept_emp")
public class DepartmentEmployee {

    @EmbeddedId
    private DepartmentEmployeePrimaryKey key;

    @Column(name = "from_date")
    private Date fromDate;

    @Column(name = "to_date")
    private Date toDate;

    @ManyToOne
    @JoinColumn(name = "dept_no")
    @MapsId("deptNo")
    private Department department;

    @ManyToOne
    @JoinColumn(name = "emp_no")
    @MapsId("empNo")
    private Employee employee;

    public DepartmentEmployeePrimaryKey getKey() {
        return key;
    }

    public void setKey(DepartmentEmployeePrimaryKey key) {
        this.key = key;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}