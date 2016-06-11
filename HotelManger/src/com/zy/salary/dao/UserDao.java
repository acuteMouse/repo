package com.zy.salary.dao;

import java.util.List;

import com.zy.salary.model.User;

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
