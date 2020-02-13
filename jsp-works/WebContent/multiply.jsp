<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@ include file="MultiplicationForm.html"%>
<table border="3">
	<%
		try {
			Integer val = Integer.parseInt(request.getParameter("val"));

			for (int i = 1; i <= 10; i++) {

				%>
				<tr>
				<td>
					<%= val %> * <%=i %> = <%=i * val %>
					</td>
				</tr>
				<%

			}

		} catch (NumberFormatException nfe) {
	%>


	<h2>Sorry Please enter only number</h2>

	<%@ include file="MultiplicationForm.html"%>
	<%
		}
	%>
</table>
</body>
</html>






































