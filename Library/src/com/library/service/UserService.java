package com.library.service;

import java.util.List;

import com.library.dao.UserDao;
import com.library.model.User;
/**
 * 用户业务层
 * @author Administrator
 *
 */
public class UserService {
	private UserDao ud=new UserDao();	//注入userDao
	/*
	 * 查找所有用户
	 */
	public List<User> finfAllUser() throws Exception {
	List<User> uList=	ud.findAllUser();
		return uList;
	}
	/*
	 * 添加用户
	 */
	public void addUser(User u) throws Exception {
		ud.addUser(u);
		
	}
	/*
	 * 更新用户信息
	 */
	public void updateUser(User u) throws Exception {
		ud.updateUser(u);
		
	}
	/*
	 * 删除用户
	 */
	public void deleteBook(int id) throws Exception {
		ud.deleteUser(id);
	}	 
}
