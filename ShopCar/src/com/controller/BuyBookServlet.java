package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Book;
import com.model.ShopCar;
import com.service.BookService;
import com.service.impl.BookServiceImpl;

public class BuyBookServlet extends HttpServlet {
	private BookService bs = new BookServiceImpl();

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		int id = Integer.parseInt(request.getParameter("id"));
		Book book = bs.findById(id);
		HttpSession session = request.getSession();
		ShopCar shopcar = (ShopCar) session.getAttribute("ShopCar");
		if (shopcar == null) {
			shopcar = new ShopCar();
			session.setAttribute("ShopCar", shopcar);

		}
		bs.addBookToShopCar(shopcar, book);
		out.write("'"+book.getName()+"'已经加入购物车了 <a href='"+request.getContextPath()+"'>继续</a>");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
