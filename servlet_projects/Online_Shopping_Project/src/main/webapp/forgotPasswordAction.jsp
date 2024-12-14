<%@page import="com.project.connectionprovider.ConnectionProvider"%>
<%@page import="java.sql.*"%>

<%
String newPassword = request.getParameter("newPassword");
String email = request.getParameter("email");
String mobileNumber =  request.getParameter("mobileNumber");
String securityQuestion = request.getParameter("securityQuestion");
String answer = request.getParameter("answer");

boolean rowsUpdated=false;

String sql="update users set password = ? where email=? and mobileNumber=? and securityQuestion=? and answer=?";
try(Connection connection=ConnectionProvider.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(sql))
{
	preparedStatement.setString(1, newPassword);
	preparedStatement.setString(2,email);
	preparedStatement.setString(3,mobileNumber);
	preparedStatement.setString(4,securityQuestion);
	preparedStatement.setString(5,answer);
	rowsUpdated = preparedStatement.executeUpdate()>0;
	if(rowsUpdated==true)
	{
		response.sendRedirect("forgotPassword.jsp?msg=passwordUpdated");
	}
	else
	{
		response.sendRedirect("login.jsp?msg=invalid");
	}
}
catch(Exception e)
{
	e.printStackTrace();
}
%>