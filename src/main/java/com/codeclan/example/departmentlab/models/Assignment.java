package com.codeclan.example.departmentlab.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "assignments")
public class Assignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "project_name")
    private String projectName;

    @ManyToOne
    @JoinColumn(name = "project_id", nullable = false)
    @JsonIgnoreProperties({"assignments"})
    private Project project;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = true)
    @JsonIgnoreProperties({"assignments"})
    private Employee employee;



    public Assignment(String projectName, Employee employee, Project project) {
        this.projectName = projectName;
        this.employee = employee;
        this.project = project;
    }

    public Assignment(){
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    //Project Additions


    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    //Employee Additions
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
