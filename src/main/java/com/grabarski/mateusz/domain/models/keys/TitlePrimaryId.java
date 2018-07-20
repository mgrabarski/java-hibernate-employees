package com.grabarski.mateusz.domain.models.keys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Mateusz Grabarski on 20.07.2018.
 */
@Embeddable
public class TitlePrimaryId implements Serializable {

    @Column(name = "empNo")
    private int empNo;

    @Column(name = "titleColumn")
    private String title;

//    @Column(name = "from_date")
//    private Date fromDate;

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

//    public Date getFrom_date() {
//        return fromDate;
//    }
//
//    public void setFrom_date(Date from_date) {
//        this.fromDate = from_date;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TitlePrimaryId that = (TitlePrimaryId) o;
        return empNo == that.empNo &&
                Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {

        return Objects.hash(empNo, title);
    }
}