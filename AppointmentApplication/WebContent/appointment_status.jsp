<!DOCTYPE html>
<html>
<body bgcolor="white">
<center>
<h1> WELCOME TO PATIENT HOME PAGE</h1>

<a href="patient_home.html">HOME</a> |
<a href="applyappointment.html">Apply Appointment</a> |
<a href="appointment_status.jsp">Appointment Status</a> |
<a href="index.html">Logout</a>
</center>
<br><br><br>

<table border="2"align="center" cellpadding="30" width="60" height="100">
<tr><td>Id</td><td>Name</td><td>Date</td><td>Time</td><td>Specalization</td><td>Status</td><td>Doctor name</td><td>Action</td>
</tr>
<%@page import="java.sql.*"%>
<%
Connection con = null;
PreparedStatement ps = null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/sql_store";
String user = "root";
String pass = "Vijaykum322";
con = DriverManager.getConnection(url, user, pass);
ps=con.prepareStatement("select * from appointment");
ResultSet rs= ps.executeQuery();
while(rs.next()){
%>
<tr><td><%=rs.getInt(1) %></td><td><%=rs.getString(2) %></td>
<td><%=rs.getString(3) %></td><td><%=rs.getString(4) %></td>
<td><%=rs.getString(5) %></td><td><%=rs.getString(6) %></td>
<td><%=rs.getString(7) %></td> 
<td><a href="delete.jsp?id=<%=rs.getInt(1) %>">Delete</a></td>
</tr>
<% 
}
%>
</table>
</body>
</html>