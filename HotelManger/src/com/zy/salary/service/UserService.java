package com.zy.salary.service;

import java.util.List;

import com.zy.salary.model.User;

public interface UserService {
		/*
		 * 登陆
		 */
		public User login(User user);

		public List<User> findAll();
}
