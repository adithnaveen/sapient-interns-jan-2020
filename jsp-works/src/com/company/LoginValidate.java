package com.company;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/home.html")
public class LoginValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		String userName = request.getParameter("uname"); 
		String password = request.getParameter("password");
		
		if(userName.equals("sapient") && password.equals("india")) {
			out.println("<h2>Welcome User " + userName +"</h2>"); 
		}else {
			out.println("<h3>Sorry invalid Credentials</h3>");
		}
		
	}

}
