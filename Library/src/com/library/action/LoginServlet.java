package com.library.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.library.model.Admin;
import com.library.service.AdminService;
import com.library.service.UserService;

public class LoginServlet extends HttpServlet {


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		AdminService as=new AdminService();
		try {
			if (as.login(name, password)) {
				Admin a=new Admin();
				a.setName(name);
				request.getSession().setAttribute("admin", a);
				request.getRequestDispatcher("/pages/main.jsp").forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		out.close();
	}

}
