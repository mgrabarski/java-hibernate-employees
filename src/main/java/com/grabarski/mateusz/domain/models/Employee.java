package com.grabarski.mateusz.domain.models;

import com.grabarski.mateusz.domain.models.enums.GenderEnum;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

/**
 * Created by Mateusz Grabarski on 20.07.2018.
 */
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @Column(name = "emp_no")
    private int empNo;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private GenderEnum gender;

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
    private List<Title> titles;

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
    private List<Salary> salaries;

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
    private List<DepartmentEmployee> departments;

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
    private List<DepartmentManager> departmentManagers;

    public Employee() {
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    public List<Title> getTitles() {
        return titles;
    }

    public void setTitles(List<Title> titles) {
        this.titles = titles;
    }

    public List<Salary> getSalaries() {
        return salaries;
    }

    public void setSalaries(List<Salary> salaries) {
        this.salaries = salaries;
    }

    public List<DepartmentEmployee> getDepartments() {
        return departments;
    }

    public void setDepartments(List<DepartmentEmployee> departments) {
        this.departments = departments;
    }

    public List<DepartmentManager> getDepartmentManagers() {
        return departmentManagers;
    }

    public void setDepartmentManagers(List<DepartmentManager> departmentManagers) {
        this.departmentManagers = departmentManagers;
    }
}