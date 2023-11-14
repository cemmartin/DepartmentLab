package com.codeclan.example.departmentlab.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "employee_number")
    private String employeeNumber;

    @OneToMany(mappedBy = "employee") //mapped by employee bc we're pointing to one of the properties in our assignment
    private List<Assignment> assignments;

    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    @JsonIgnoreProperties({"employees"})
    private Department department;

    public Employee(){
    }

    public Employee(String firstName, String lastName, String employeeNumber, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeNumber = employeeNumber;
        this.department = department;
        this.assignments = new ArrayList<>();
    }


    //Getters & setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    //Department Additions

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }


    //Assignment Additions
    public List<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(List<Assignment> assignments) {
        this.assignments = assignments;
    }
}


