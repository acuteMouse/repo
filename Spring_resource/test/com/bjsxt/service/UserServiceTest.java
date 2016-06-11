package com.bjsxt.service;


import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.bjsxt.service.*;
import com.bjsxt.model.User;

//Dependency Injection
//Inverse of Control
public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		
	UserService userService=(UserService) ctx.getBean("userservice");
			userService.add(new User());
		
		ctx.destroy();
		
	}

}
