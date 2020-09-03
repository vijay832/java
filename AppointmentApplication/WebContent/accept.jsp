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
String name=(String)session.getAttribute("name");
ps=con.prepareStatement("update appointment set status='Accepted',dname=? where aid=?");
ps.setInt(2,id);
ps.setString(1,name);
int x=ps.executeUpdate();
if(x!=0)
	response.sendRedirect("./appointment_details.jsp?msg=success");

%>