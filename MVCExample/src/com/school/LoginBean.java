package com.school;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginBean {
	private String username;
	private String password;
	
public String getUsername() {
		return username;
	}
public String getPassword() {
		return password;
	}
public void setUsername(String username) {
		this.username = username;
	}
public void setPassword(String password) {
		this.password = password;
	}

public boolean validate(String username,String password) throws ClassNotFoundException, SQLException {
	Connection con=null;
	PreparedStatement ps=null;
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url = "jdbc:mysql://localhost:3306/sql_store";
	String user = "root";
	String pass = "Vijaykum322";
    con = DriverManager.getConnection(url, user, pass);
    ps=con.prepareStatement("select * from doctor where name=? and password=?");
    ps.setString(1, username);
    ps.setString(2, password);
    ResultSet rs=ps.executeQuery();
    boolean status=false;
    if(rs.next()) 
    	status=true;
                               
        return status;
  	
    
    
}
}
