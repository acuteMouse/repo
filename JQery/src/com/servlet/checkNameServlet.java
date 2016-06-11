package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDao;

public class checkNameServlet extends HttpServlet {

	

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	
	}

	

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserDao userDao=new UserDao();
		response.setContentType("application/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		String name=request.getParameter("name");
		System.out.println(name);
		boolean isExit = false;
		try {
			 isExit=userDao.checkName(name);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (isExit) {
			out.print("该用户名已经存在");
		} else {
			out.print("此用户名可以使用");
		}
		
		out.flush();
		out.close();
	}

}
