package com.grabarski.mateusz.domain.models;

import com.grabarski.mateusz.domain.models.keys.TitlePrimaryId;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;

/**
 * Created by Mateusz Grabarski on 20.07.2018.
 */
@Entity
@Table(name = "titles")
public class Title {

    @EmbeddedId
    private TitlePrimaryId id;

    @Column(name = "title")
    private String title;

    @Column(name = "emp_no")
    private int emp_no;

    @Column(name = "from_date")
    private Date fromDate;

    @Column(name = "to_date")
    private Date toDate;

    public TitlePrimaryId getId() {
        return id;
    }

    public void setId(TitlePrimaryId id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(int emp_no) {
        this.emp_no = emp_no;
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
}