<%@page import="java.sql.*"%>
<%
Connection con = null;
PreparedStatement ps = null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/sql_store";
String user = "root";
String pass = "Vijaykum322";
con = DriverManager.getConnection(url, user, pass);
ps=con.prepareStatement("insert into appointment(name,dao,tao,specalization,status,dname) values(?,?,?,?,?,?)");
String username=request.getParameter("name");
String dao=request.getParameter("dao");
String tao=request.getParameter("tao");
String specalization=request.getParameter("specalization");
ps.setString(1,username);
ps.setString(2,dao);
ps.setString(3,tao);
ps.setString(4,specalization);
ps.setString(5,"pending");
ps.setString(6,"none");

int x=ps.executeUpdate();
if(x!=0)
	response.sendRedirect("./applyappointment.html");

%>