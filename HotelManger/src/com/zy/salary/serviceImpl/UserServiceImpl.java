package com.zy.salary.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zy.salary.dao.UserDao;
import com.zy.salary.model.User;
import com.zy.salary.service.UserService;


@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao; // 注入dao

	public User login(User user) {

		return this.userDao.login(user);
	}

	public List<User> findAll() {
		
		return this.userDao.getALlUser();
	}

}
