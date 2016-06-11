package com.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.springmvc.model.User;

@RequestMapping("/user")
public class HomeCtroller  {
	@RequestMapping("/login")
	protected ModelAndView handleRequestInternal(User u,HttpServletRequest request,
			HttpServletResponse response) throws Exception {

			System.out.println(u.getName());
		return new ModelAndView("index");
	}


}
