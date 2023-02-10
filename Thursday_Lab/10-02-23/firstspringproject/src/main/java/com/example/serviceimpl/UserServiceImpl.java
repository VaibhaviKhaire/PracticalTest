package com.example.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exception.UserNotFoundException;
import com.example.model.User;
import com.example.repository.UserRepository;
import com.example.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository repo;
	
	@Override
	//Saving user details by jpa repository save()
	public User saveUser(User user) {
		return repo.save(user) ;
	}

	@Override
	//fetching all user details by jpa repository findAll()
	public List<User> getAllUser() {
		return repo.findAll();
	}

	@Override
	//fetching user details by jpa repository
	public User getUserById(int id) {
	//find by id , if not present then throw custom exception
		return repo.findById(id).orElseThrow(() -> new UserNotFoundException("User not found in table"));
	}

	@Override
	public User updateUserById(User user, int id) {
		//find by id , if not present then throw custom exception
		User exituser = repo.findById(id).orElseThrow(() -> new UserNotFoundException("User not found in table"));
		//set new value
		exituser.setUserEmail(user.getUserEmail());
		exituser.setPhnNumber(user.getPhnNumber());
		repo.save(exituser);
		return null ;
	}

	@Override
	//fetching user details using jpa repository findById and removing it using deleteById
	public void deleteUserById(int id) {
	
		repo.findById(id).orElseThrow(() -> new UserNotFoundException("User not found in table"));
		repo.deleteById(id);
		
	}
	

}