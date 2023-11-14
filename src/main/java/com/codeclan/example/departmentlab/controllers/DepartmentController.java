package com.codeclan.example.departmentlab.controllers;

import com.codeclan.example.departmentlab.models.Department;
import com.codeclan.example.departmentlab.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

//Not necessary as they weren't in the brief!

@RestController
public class DepartmentController {
    @Autowired
    DepartmentRepository departmentRepository;

    @GetMapping(value = "/departments")
    public List<Department> getAllDepartments(){
        return departmentRepository.findAll();
    }

    @GetMapping(value = "/departments/{id}")
    public Optional<Department> getIndividualDepartment(@PathVariable Long id){
        return departmentRepository.findById(id);
    }
}
