package com.restapi.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.restapi.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>{
	List<Employee> findByDesignation(String desination);

}
