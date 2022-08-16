package com.jdbc.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JDBCTest extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter pw = resp.getWriter();
		Statement statement = null;
		Connection db = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			db=DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","toor");
			statement = db.createStatement();
			ResultSet result = statement.executeQuery("Select * from user");
			pw.println(" <table>" + "  <tr>" + "    <th>First Name</th>" + "    <th>Last Name</th>"
					+ "    <th>Email</th>" + "  </tr>");
			while (result.next()) {
				pw.println(" <tr>" + "    <td>" + result.getString(2) + "</td>" + "    <td>" + result.getString(3)
						+ "</td>" + "    <td>" + result.getString(4) + "</td>" + "  </tr>");

			}
			pw.println("</table>");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				db.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}