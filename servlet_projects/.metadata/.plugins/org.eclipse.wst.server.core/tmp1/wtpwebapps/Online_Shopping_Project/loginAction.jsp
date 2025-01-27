<%@page import="com.project.connectionprovider.ConnectionProvider"%>
<%@page import="java.sql.*"%>

<%
String email =  request.getParameter("email");
String password = request.getParameter("password");
if(("admin@gmail.com".equals(email)) && ("admin".equals(password)))
{
	session.setAttribute("email", email);
	response.sendRedirect("admin/adminHome.jsp");
}
else
{
	boolean userExisted = false;
	String sql="select * from users where email=? and password=?";
	try(Connection connection=ConnectionProvider.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql))
	{
		preparedStatement.setString(1, email);
		preparedStatement.setString(2, password);
		ResultSet rs = preparedStatement.executeQuery();
		while(rs.next())
		{
			userExisted = true;
			session.setAttribute("email", email);
			response.sendRedirect("home.jsp");
		}
		if(userExisted==false)
		{
			response.sendRedirect("login.jsp?msg=notExist");
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
		response.sendRedirect("login.jsp?msg=invalid");
	}
}
%>