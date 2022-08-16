<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
String name = request.getParameter("username");
String password = request.getParameter("password");

if (name.equals("chirag") && password.equals("1234")) {
	session.setAttribute("name", name);
	response.sendRedirect("dashboard.jsp");
} else {
	response.sendRedirect("index.jsp");

}
%>
