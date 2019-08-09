package com.restapi.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.restapi.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	List<Employee> findByDesignation(String desination);

	Employee deleteById(int id);

	Employee findById(int id);

}
