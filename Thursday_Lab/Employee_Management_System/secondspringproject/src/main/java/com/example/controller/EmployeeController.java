package com.example.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.Employee;
import com.example.service.EmployeeService;

@RestController
public class EmployeeController {
	
	

		@Autowired
		   private EmployeeService us;
		   //saving user details using rest api post mapping
		   @PostMapping("/save")
		   public ResponseEntity<Employee> saveUser(@RequestBody Employee employee){
			   return new ResponseEntity<Employee>(us.saveEmployee(employee),HttpStatus.CREATED);  
		}
		   // get user details using rest api get Mapping
		   @GetMapping("/getemployee")
		   public List<Employee> getAllEmployee(){
			   return us.getAllEmployee();
		   }
		   
		   // get employee details from table using rest api GET mapping with id attribute
		   @GetMapping("/getemployeebyid/{id}")
		   public ResponseEntity<Employee> getEmployeerById(@PathVariable("id")int id){
			   return new ResponseEntity<Employee>(us.getEmployeeById(id),HttpStatus.OK);
			  
		   }
		   
		   //updating employee details from table using rest api PUT mapping with id attribute
		   @PutMapping("/updatebyid/{id}")
		   public ResponseEntity<Employee> updateEmployeeById(@PathVariable("id") int id, @RequestBody Employee employee){
			   return new ResponseEntity<Employee> (us.updateEmployeeById(employee,id),HttpStatus.OK);
		   }
		   
		   
		   //delete employee details from table using rest api delete mapping using id attribute
		   @DeleteMapping("/deleteuser/{id}")
		   public ResponseEntity<String> deleteEmployeeById(@PathVariable("id") int id){
			   us.deleteEmployeerById(id);
			   return new ResponseEntity<String>("Employee deleted Successfully",HttpStatus.OK);
		   }
	}



