package com.grabarski.mateusz.domain.models.keys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

/**
 * Created by Mateusz Grabarski on 20.07.2018.
 */
@Embeddable
public class SalaryPrimaryKey implements Serializable {

    @Column(name = "emp_no")
    private int empNo;

    @Column(name = "from_date")
    private Date fromDate;

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalaryPrimaryKey that = (SalaryPrimaryKey) o;
        return empNo == that.empNo &&
                Objects.equals(fromDate, that.fromDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(empNo, fromDate);
    }
}