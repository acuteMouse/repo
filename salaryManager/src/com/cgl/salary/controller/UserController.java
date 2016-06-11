package com.cgl.hotel.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.HandlerChain;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJacksonJsonView;

import com.cgl.hotel.model.User;
import com.cgl.hotel.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user", method = RequestMethod.POST)
public class UserController {

	@Resource
	private UserService userService; // 注入service

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public UserService getUserService() {
		return userService;
	}

	@SuppressWarnings("deprecation")
	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public ModelAndView login(User user, HttpServletRequest request) {
		// String userName=request.getParameter("userName");
		// String password=request.getParameter("password");
		User u = userService.login(user);

		if (u == null) {
			request.setAttribute("Error", "用户名或者密码不对");
			return new ModelAndView("index");
		} else {
			Map<String, User> map = new HashMap<String, User>();
			map.put("user", u);
			return new ModelAndView(new MappingJacksonJsonView(), map);

		}
	}
	/*
	 * 获取所有信息
	 */
	@SuppressWarnings("deprecation")
	@ResponseBody
	@RequestMapping(value="/getInfo",method=RequestMethod.POST,produces="application/json")
	public ModelAndView getAllUser(HttpServletRequest request) {
		List<User> users = userService.findAll();
		Map<String, List<User>> userMap = new HashMap<String, List<User>>();
		if (users.size() > 0) {
			userMap.put("users", users);
		}
		return new ModelAndView(new MappingJacksonJsonView(), userMap);
	}
}
