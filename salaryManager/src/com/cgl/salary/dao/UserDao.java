package com.cgl.hotel.dao;

import java.util.List;

import com.cgl.hotel.model.User;

public interface UserDao {
	/*
	 * 登陆
	 */
	public  User login(User user);
	/*
	 * 查询所有
	 */
	public  List<User> getALlUser();
}
