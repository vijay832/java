<!DOCTYPE html>
<html>
<body bgcolor="white">
<center>
<h1 style="color:green;"> WELCOME TO DOCTOR HOME PAGE</h1>
<a href="doctor_home.html">Home |</a>
<a href="doctor_profile.jsp">Profile |</a>
<a href="appointment_details.jsp">Appointment Details |</a>
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
String specalization=(String)session.getAttribute("specalization");
ps=con.prepareStatement("select * from appointment where specalization=?");
ps.setString(1, specalization);
ResultSet rs= ps.executeQuery();
while(rs.next()){
%>
<tr><td><%=rs.getInt(1) %></td><td><%=rs.getString(2) %></td>
<td><%=rs.getString(3) %></td><td><%=rs.getString(4) %></td>
<td><%=rs.getString(5) %></td><td><%=rs.getString(6) %></td>
<td><%=rs.getString(7) %></td>
<% if(rs.getString("status").equals("pending")){%>
<td><a href="accept.jsp?id=<%=rs.getInt(1)%>">Accept</a></td>
<%}else{ %>
<td>Done</td>
<% } %>
</tr>
<% 
}
%>
</table>
</body>
</html>