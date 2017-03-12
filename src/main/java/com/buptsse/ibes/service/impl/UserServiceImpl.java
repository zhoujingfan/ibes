package com.buptsse.ibes.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buptsse.ibes.dao.UserDao;
import com.buptsse.ibes.model.User;
import com.buptsse.ibes.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	
	public User getById(int userId) {
		// TODO Auto-generated method stub
		return userDao.selectByPrimaryKey(userId);
	}

	public User getByUsername(String username) {
		// TODO Auto-generated method stub
		return userDao.selectByUsername(username);
	}

}
