package com.company;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init() {
		System.out.println("Hi i'm in init... ");
		
	}
	public void destroy() {
		System.out.println("Hi i'm in destroy ");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
				throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); 
		
		
		out.println("<html>");
		out.println("<head><title>Welcome to Servlets</title></head>");
		out.println("<body><h2>First Program with Servlet </h2></body>");
		out.println("</html>");
		
		
	}

}



















