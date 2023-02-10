
	package com.example.service;

	import java.util.List;

	import com.example.model.User;

	//User Service interface
	public interface UserService {
		
		//inserting user details in table
		User saveUser(User user);
		
		//fetching all user details from table
		List<User>getAllUser();
		
		//fetching user details from table
		User getUserById(int id);
		
		//modifying user details from table based on user id
		User updateUserById(User user, int id);
		
		//remove user details from table based on user id
		void deleteUserById(int id);

	}




