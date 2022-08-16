package com.myapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public login() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @throws IOException 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
	String email=request.getParameter("email");
	String password=request.getParameter("password");
	PrintWriter pw=response.getWriter();
	response.setContentType("text/html");

	pw.println("<table><tr><th> Email</th>");
	pw.println("<th> Password</th></tr>");
	pw.println("<tr><td>"+email+"</td>");
	pw.println("<td>"+password+"</td></tr></table>");
}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");

		pw.println("<table><tr><th> Email</th>");
		pw.println("<th> Password</th></tr>");
		pw.println("<tr><td>"+email+"</td>");
		pw.println("<td>"+password+"</td></tr></table>");
	}

}
