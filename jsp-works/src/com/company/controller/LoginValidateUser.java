package com.company.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.pojo.User;
import com.company.pojo.UserDAO;

@WebServlet("/loginvalidate")
public class LoginValidateUser extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		User user = getUser(request); 
		
		String page; 
		
		if(new UserDAO().validateUser(user)) {
			 page ="login-success.jsp"; 
		}else {
			page = "login-failure.jsp"; 
		
		}
		
		request.getRequestDispatcher("/WEB-INF/views/"+page).forward(request, response);
		
	}

	private User getUser(HttpServletRequest request) {
		String userName = request.getParameter("uname"); 
		String city = request.getParameter("city"); 
		
		User user = new User(userName, city);
		return user;
	}

}
