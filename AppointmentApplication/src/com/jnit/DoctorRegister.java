package com.jnit;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DoctorRegister extends HttpServlet {

	Connection con=null;
	PreparedStatement ps=null;

	public void init(ServletConfig config) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/sql_store";
			String username = "root";
			String password = "Vijaykum322";
		    con = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String name = request.getParameter("dname");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		long phone = Long.parseLong(request.getParameter("phone"));
		String specalization = request.getParameter("specalization");
		try {
		    ps = con.prepareStatement("INSERT INTO doctor(name,password,email,phone,specalization) VALUES(?,?,?,?,?)");
			ps.setString(1,name);
			ps.setString(2,password);
			ps.setString(3,email);
			ps.setLong(4,phone);
			ps.setString(5,specalization);
			PrintWriter pw = response.getWriter();
			int x = ps.executeUpdate();
			pw.println("<html><body bgcolor='white'></h1><center>");
			if (x != 0) {
				
				pw.println("Registered Sucessfully "+name);
				response.sendRedirect("./doctor_login.html");
            }
			pw.println("</center></h1></body></html>");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
