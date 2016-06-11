package com.cgl.hotel.service;

import java.util.List;

import com.cgl.hotel.model.User;

public interface UserService {
		/*
		 * 登陆
		 */
		public User login(User user);

		public List<User> findAll();
}
