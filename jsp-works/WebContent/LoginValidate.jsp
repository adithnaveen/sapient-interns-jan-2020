<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>Welcome to login validation page</h2>


<%
	String userName = request.getParameter("uname");
	String password = request.getParameter("password"); 
	
	if(userName.equals("sapient") && password.equals("india")){
		out.println("Welcome User");
	}else {
		out.println("Sorry invalid Credentials.."); 
		
		%>
			<%@ include file="LoginForm.html" %>
		<%
	}
%>

</body>
</html>