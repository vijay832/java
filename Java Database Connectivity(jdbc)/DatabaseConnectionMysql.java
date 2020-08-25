package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnectionMysql {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String username="root";
		String password="Vijaykum322";
		String url="jdbc:mysql://localhost:3306/sql_store";
		
		Connection con=DriverManager.getConnection(url, username, password);
		
		if(con!=null) {
			System.out.println("Connection established");
		}
		Statement st=con.createStatement();
		int x=st.executeUpdate("INSERT INTO student VALUES (10,'vijay','kumar','CS',21)");
		if(x!=0)
		  {
			System.out.println("Record inserted");
		  }
		
		int y=st.executeUpdate("UPDATE student SET age=22 WHERE studentid=1");
		if(y!=0)
		  {
			System.out.println("Record updated");
		  }
		
		int z=st.executeUpdate("DELETE FROM student WHERE studentid=10");
		if(z!=0)
		  {
			System.out.println("record deleted");
		  }
		con.close();
	}

}
