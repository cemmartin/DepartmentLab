package com.codeclan.example.departmentlab.repositories;

import com.codeclan.example.departmentlab.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
