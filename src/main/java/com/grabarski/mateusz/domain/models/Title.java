package com.grabarski.mateusz.domain.models;

import com.grabarski.mateusz.domain.models.keys.TitlePrimaryKey;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Mateusz Grabarski on 20.07.2018.
 */
@Entity
@Table(name = "titles")
public class Title {

    @EmbeddedId
    private TitlePrimaryKey id;

    @Column(name = "to_date")
    private Date toDate;

    @ManyToOne()
    @JoinColumn(name = "emp_no")
    @MapsId("empNo")
    private Employee employee;

    public TitlePrimaryKey getId() {
        return id;
    }

    public void setId(TitlePrimaryKey id) {
        this.id = id;
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