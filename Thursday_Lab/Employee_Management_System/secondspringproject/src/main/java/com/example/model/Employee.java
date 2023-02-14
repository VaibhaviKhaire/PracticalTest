package com.example.model;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

	@Entity
		@Table(name = "userdetails")
public class Employee {

			@Id
			@GeneratedValue(strategy=GenerationType.IDENTITY)
			private int id;
			
			@Column(length = 30 , nullable = false)
			@NotBlank(message="Please Enter Your EmployeeName!!!")
			private String uName;

			@Column(length = 30 , nullable = false, unique = true)
			@NotBlank(message="Please Enter Your EmployeeName!!!")
			@Email
			private String employeeEmail;
			
			@Column(length = 10 , nullable = false, unique = true)
			private long phnNumber;

			public int getId() {
				return id;
			}

			public void setId(int id) {
				this.id = id;
			}

			public String getuName() {
				return uName;
			}

			public void setuName(String uName) {
				this.uName = uName;
			}

			public String getEmployeeEmail() {
				return employeeEmail;
			}

			public void setEmployeeEmail(String employeeEmail) {
				this.employeeEmail = employeeEmail;
			}

			public long getPhnNumber() {
				return phnNumber;
			}

			public void setPhnNumber(long phnNumber) {
				this.phnNumber = phnNumber;
			}

			 
			
			
			
		}





