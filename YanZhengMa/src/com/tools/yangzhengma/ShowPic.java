package com.tools.yangzhengma;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ShowPic extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException {

		Pic image = new Pic();
		String string = null;
		string = image.getPic(0, 0, response.getOutputStream());
		request.getSession().setAttribute("certCode2", string);
	}

}
