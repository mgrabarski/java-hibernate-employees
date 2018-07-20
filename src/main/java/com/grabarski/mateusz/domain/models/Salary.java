package com.grabarski.mateusz.domain.models;

import com.grabarski.mateusz.domain.models.keys.SalaryPrimaryKey;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Mateusz Grabarski on 20.07.2018.
 */
@Entity
@Table(name = "salaries")
public class Salary {

    @EmbeddedId
    private SalaryPrimaryKey key;

    @Column(name = "salary")
    private int salary;

    @Column(name = "to_date")
    private Date toDate;

    @ManyToOne
    @JoinColumn(name = "emp_no")
    @MapsId("empNo")
    private Employee employee;

    public SalaryPrimaryKey getKey() {
        return key;
    }

    public void setKey(SalaryPrimaryKey key) {
        this.key = key;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}