package com.codeclan.example.departmentlab.repositories;

import com.codeclan.example.departmentlab.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
