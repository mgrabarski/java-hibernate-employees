package com.grabarski.mateusz.domain.models;

import com.grabarski.mateusz.domain.models.keys.SalaryPrimaryKey;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
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
}