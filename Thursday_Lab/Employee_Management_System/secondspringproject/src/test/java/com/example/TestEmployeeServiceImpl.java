
package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.model.Employee;

public class TestEmployeeServiceImpl {

		Employee e=new Employee();
		@Test
		//Negative Testing
		public void testgetuName() {
			assertEquals("vaibhavi",e.getuName());
		}
		
}