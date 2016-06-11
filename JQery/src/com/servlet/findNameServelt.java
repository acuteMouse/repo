package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDao;
import com.model.User;

public class findNameServelt extends HttpServlet {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserDao userdao=new UserDao();
		
			User u = null;
			
			try {
				u = userdao.findUser();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			response.setContentType("application/html; charset=utf-8");
			PrintWriter out=response.getWriter();
			String json="{\"name\":\"张三\",\"age\":16}";
//			out.print(u.getUserName());
			out.print(json);
		
}
}