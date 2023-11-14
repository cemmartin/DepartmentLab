package com.codeclan.example.departmentlab.models;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "project_name")
    private String projectName;

    @Column(name = "duration")
    private int duration;

    @OneToMany(mappedBy = "project")
    private List<Assignment> assignments;

    public Project(){
    }

    public Project(String projectName, int duration) {
        this.projectName = projectName;
        this.duration = duration;
        this.assignments = new ArrayList<>();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(List<Assignment> assignments) {
        this.assignments = assignments;
    }
}
