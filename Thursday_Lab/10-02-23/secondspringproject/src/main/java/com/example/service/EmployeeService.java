package com.example.service;
import java.util.List;

import com.example.model.Employee;
//Employee Service interface

public interface EmployeeService {

	//inserting employee details in table
		Employee saveEmployee(Employee employee);
		
		//fetching all employee details from table
		List<Employee>getAllEmployee();
		
		//fetching employee details from table
		Employee getEmployeeById(int id);
		
		//modifying employee details from table based on employee id
		Employee updateEmployeeById(Employee employee, int id);
		
		//remove employee details from table based on employee id
		void deleteEmployeerById(int id);

		
	}






