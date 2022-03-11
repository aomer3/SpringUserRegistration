package com.userRegistration.services;

import java.util.List;

import com.userRegistration.entity.User;

public interface UserService {
	
	int save(User user);
	
	List<User> getUsers();
	
	User getUser(Integer id);
}
