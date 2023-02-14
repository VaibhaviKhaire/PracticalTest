package com.assignment;

	import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.assignment.model.*;
	public class TestStudentDao {
		Student sc=new Student("vaibhavi","khaire","vaibhavikhire07@gmail.com");
				
		/*@Test
		public void testgetFirstName() {
			assertEquals("vaibhavi",sc.getFirstName());
		*/
		
		@Test
		public void testgetLastName() {
			assertEquals("mansi",sc.getLastName());
		}

	}


