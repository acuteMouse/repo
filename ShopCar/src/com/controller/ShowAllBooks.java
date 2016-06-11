package com.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Book;
import com.service.BookService;
import com.service.impl.BookServiceImpl;

public class ShowAllBooks extends HttpServlet {
	private BookService bs = new BookServiceImpl();

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Map<Integer, Book> books=bs.findAllbook();
			request.setAttribute("books", books);
			request.getRequestDispatcher("/WEB-INF/jsp/bookList.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
