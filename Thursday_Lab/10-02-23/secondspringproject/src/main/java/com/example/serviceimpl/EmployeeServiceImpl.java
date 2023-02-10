package com.example.serviceimpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exception.EmployeeNotFoundException;
import com.example.model.Employee;
import com.example.repository.EmployeeRepository;
import com.example.service.EmployeeService;

@Service
public class EmployeeServiceImpl  implements EmployeeService {
	

		@Autowired
		EmployeeRepository repo;
		
		@Override
		//Saving employee details by jpa repository save()
		public Employee saveEmployee(Employee employee) {
			return repo.save(employee) ;
		}

		@Override
		//fetching all employee details by jpa repository findAll()
		public List<Employee> getAllEmployee() {
			return repo.findAll();
		}

		@Override
		//fetching employee details by jpa repository
		public Employee getEmployeeById(int id) {
		//find by id , if not present then throw custom exception
			return repo.findById(id).orElseThrow(() -> new EmployeeNotFoundException("Employee not found in table"));
		}

		@Override
		public Employee updateEmployeeById(Employee employee, int id) {
			//find by id , if not present then throw custom exception
			Employee exitemployee = repo.findById(id).orElseThrow(() -> new EmployeeNotFoundException("Employee not found in table"));
			//set new value
			exitemployee.setEmployeeEmail(employee.getEmployeeEmail());
			exitemployee.setPhnNumber(employee.getPhnNumber());
			repo.save(exitemployee);
			return null ;
		}

		
		//fetching employee details using jpa repository findById and removing it using deleteById
		public void deleteEmployeeById(int id) {
		
			repo.findById(id).orElseThrow(() -> new EmployeeNotFoundException("Employee not found in table"));
			repo.deleteById(id);
			
		}

		@Override
		public void deleteEmployeerById(int id) {
			// TODO Auto-generated method stub
			
		}
		

	}

