package com.grabarski.mateusz.domain.models.keys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Mateusz Grabarski on 20.07.2018.
 */
@Embeddable
public class DepartmentEmployeePrimaryKey implements Serializable {

    @Column(name = "emp_no")
    private int empNo;

    @Column(name = "dept_no")
    private String deptNo;

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepartmentEmployeePrimaryKey that = (DepartmentEmployeePrimaryKey) o;
        return empNo == that.empNo &&
                Objects.equals(deptNo, that.deptNo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(empNo, deptNo);
    }
}