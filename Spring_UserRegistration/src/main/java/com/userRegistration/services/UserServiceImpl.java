package com.userRegistration.services;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.userRegistration.dao.UserDao;
import com.userRegistration.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	@Override
	@Transactional
	public int save(User user) {
		return dao.create(user);
	}

	@Override
	public List<User> getUsers() {
		List<User> users = dao.findUsers();
		
		//This will sort users according to how comparable method in Users is specified
		Collections.sort(users);
		
		return users;
	}

	@Override
	public User getUser(Integer id) {
		return dao.findUser(id);
	}
	
}
