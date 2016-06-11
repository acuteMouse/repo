package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.ShopCar;
import com.service.BookService;
import com.service.impl.BookServiceImpl;

public class ChangeNumberServlet extends HttpServlet {
			private BookService bs=new BookServiceImpl();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			response.setContentType("text/hthml;charset=utf-8;");
			try {
				String bookId=request.getParameter("bookId");
				int bookid=Integer.parseInt(bookId);
				String newNumber=request.getParameter("newNumber");
				int number=Integer.parseInt(newNumber);
				ShopCar sc=(ShopCar)request.getSession().getAttribute("ShopCar");
				if (number<1) {
					request.setAttribute("message", "<script type='text/script'>alert('请输入大于0正整数字！');</script>");
	
				} else {
					bs.changNumber(sc,bookid,number);
				}

			} catch (NumberFormatException e) {
				request.setAttribute("message", "<script type='text/javascript'>alert('请输入大于0正整数字！');</script>");
				
			}
		
			request.getRequestDispatcher("/WEB-INF/jsp/ShowShopCar.jsp").forward(request, response);
	}
	
}
