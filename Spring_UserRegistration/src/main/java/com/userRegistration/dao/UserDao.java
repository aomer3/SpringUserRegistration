package com.userRegistration.dao;

import java.util.List;

import com.userRegistration.entity.User;

public interface UserDao {
	
	int create(User user);
	
	List<User> findUsers();
	
	User findUser(Integer id);

}
