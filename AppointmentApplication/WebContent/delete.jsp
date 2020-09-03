<%@page import="java.sql.*"%>
<%
Connection con = null;
PreparedStatement ps = null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/sql_store";
String user = "root";
String pass = "Vijaykum322";
con = DriverManager.getConnection(url, user, pass);
int id=Integer.parseInt(request.getParameter("id"));
ps=con.prepareStatement("delete from appointment where aid=?");
ps.setInt(1,id);
int x=ps.executeUpdate();
if(x!=0)
	response.sendRedirect("./appointment_status.jsp?msg=success");

%>