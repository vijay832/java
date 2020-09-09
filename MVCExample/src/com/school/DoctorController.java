package com.school;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DoctorController")
public class DoctorController extends HttpServlet {

@Override
public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
	
	String name=request.getParameter("dname");
	String password=request.getParameter("password");
	
	LoginBean lb=new LoginBean();
	try {
		boolean s=lb.validate(name, password);
		if(s)
		  response.sendRedirect("./doctor_home.html");
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

}
