package com.codeclan.example.departmentlab.repositories;

import com.codeclan.example.departmentlab.models.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
}
