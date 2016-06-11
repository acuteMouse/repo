package com.cgl.hotel.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cgl.hotel.dao.UserDao;
import com.cgl.hotel.model.User;
import com.cgl.hotel.service.UserService;


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
