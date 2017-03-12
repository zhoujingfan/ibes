package com.buptsse.ibes.service;

import java.util.List;

import com.buptsse.ibes.model.User;

public interface UserService {
	/**
	 * 通过Id查询用户
	 * @param userId
	 * @return User
	 */
	User getById(int userId);
	/**
	 * 通过用户名查询用户
	 * @param username
	 * @return
	 */
	User getByUsername(String username);

}
