package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Blob;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialBlob;
import javax.sql.rowset.serial.SerialException;

import com.dao.fileDao;
import com.model.Pic;

public class uploadServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 926849432856621991L;
	private fileDao fd=null;
	private Blob b=null;
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String image = request.getParameter("file");
		System.out.println(image);

		try {
			b = new SerialBlob(image.getBytes("GBK"));
			System.out.println(b);
		} catch (SerialException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		Pic p = new Pic();
		p.setFile(b);
		fd = new fileDao();
		try {
			fd.upFile(p);
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher("/success.jsp").forward(request, response);
}
}