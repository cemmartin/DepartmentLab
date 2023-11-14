package com.codeclan.example.departmentlab;

import com.codeclan.example.departmentlab.models.Assignment;
import com.codeclan.example.departmentlab.models.Department;
import com.codeclan.example.departmentlab.models.Employee;
import com.codeclan.example.departmentlab.models.Project;
import com.codeclan.example.departmentlab.repositories.AssignmentRepository;
import com.codeclan.example.departmentlab.repositories.DepartmentRepository;
import com.codeclan.example.departmentlab.repositories.EmployeeRepository;
import com.codeclan.example.departmentlab.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
class DepartmentlabApplicationTests {

	@Autowired
	DepartmentRepository departmentRepository;
	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Autowired
	AssignmentRepository assignmentRepository;


	@Test
	void contextLoads() {
	}
//
//	@Test
//	public void createEmployee(){
//
//		Employee employee1 = new Employee("Maurice", "Moss", "EN123");
//		employeeRepository.save(employee1);
////	}
//
//	@Test
//	public void createAssignmentAndEmployee(){
//		//To make the below happy:
//		Department dept1 = new Department("IT");
//		departmentRepository.save(dept1);
//		//
//
//		Employee employee2 = new Employee("Roy", "Trenneman", "EN234", dept1);
//		employeeRepository.save(employee2);
//
//		Assignment assignment1 = new Assignment("Fix Denholm's computer", employee2);
//		assignmentRepository.save(assignment1);
//	}

//	@Test void createEmployeeaAndDept(){
//		Department dept1 = new Department("IT");
//		departmentRepository.save(dept1);
//
//		Employee employee3 = new Employee("Jen", "Barber", "EN345", dept1);
//		employeeRepository.save(employee3);
//		Employee employee4 = new Employee("Richmond", "Avenal", "EN012", dept1);
//		employeeRepository.save(employee4);
//
//	}

	@Test
	public void getAssignmentAndEverythingElse(){
		Department dept1 = new Department("IT");
		departmentRepository.save(dept1);

		Project project1 = new Project("Help Denholm", 3);
		projectRepository.save(project1);

		Employee employee2 = new Employee("Roy", "Trenneman", "EN234", dept1);
		employeeRepository.save(employee2);

		Assignment assignment1 = new Assignment("Fix Denholm's computer", employee2, project1);
		assignmentRepository.save(assignment1);

		//
		Project project2 = new Project("Escape Douglas Reynholm", 312);
		projectRepository.save(project2);
		Employee employee3 = new Employee("Jen", "Barber", "EN345", dept1);
		employeeRepository.save(employee3);
		Assignment assignment2 = new Assignment("Avoid Doug", employee3, project2);
		assignmentRepository.save(assignment2);


	}

}
