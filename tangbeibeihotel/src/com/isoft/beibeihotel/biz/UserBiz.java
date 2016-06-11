 package com.isoft.beibeihotel.biz;

import java.util.Map;

import com.isoft.beibeihotel.dao.UserDao;
import com.isoft.beibeihotel.entity.User;


public class UserBiz {
	private UserDao userdao;
	public UserBiz(){
		userdao=new UserDao();
	}
	//增
	public void add(User user){
		userdao.writer(user);
	}
	//改
	public void update(Map<String,User> map){
		userdao.writer(map.values());
	}
	//查
	public Map<String,User> search(){
		return userdao.reader();
	}
}
