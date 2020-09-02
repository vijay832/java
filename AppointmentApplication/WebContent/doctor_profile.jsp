<%@page import="java.sql.*"%>
<html>
<body bgcolor="white"></body>
<br><br><br><br>
<center>

<h1 style="color:green;">WELCOME TO DOCTOR PROFILE PAGE</h1>

<a href="doctor_home.html">Home||</a>
<a href="doctor_profile.jsp">Profile</a>

<br><br><br>

</center>
<table border="2"align="center" cellpadding="30" width="60" height="100">
<tr><td>Id</td><td>Name</td><td>Email</td><td>Phone</td><td>Specalization</td>
<%
Connection con = null;
PreparedStatement ps = null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/sql_store";
String user = "root";
String pass = "Vijaykum322";
con = DriverManager.getConnection(url, user, pass);
ps = con.prepareStatement("select * from doctor where name=?");
  
     Object o=session.getAttribute("name"); 
     String name=(String)o;
     ps.setString(1,name);
      ResultSet rs = ps.executeQuery();
      System.out.println(rs);

      while (rs.next()){
%>

<tr>
<td><%=rs.getInt(1) %></td>
<td><%=rs.getString(2) %></td>
<td><%=rs.getString(4) %></td>
<td><%=rs.getString(5) %></td>
<td><%=rs.getString(6) %></td>
</tr>

<%
    }
%>
</table>
</body>
</html>