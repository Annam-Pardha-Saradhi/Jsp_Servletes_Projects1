<%@page import="com.project.connectionprovider.ConnectionProvider"%>
<%@page import="java.sql.*"%>

<%
String email = session.getAttribute("email").toString();
String newSecurityQuestion = request.getParameter("newSecurityQuestion");
String newAnswer = request.getParameter("newAnswer");
String password = request.getParameter("password");
int check=0;
String sql1 = "select * from users where email='"+email+"' and password='"+password+"'";
String sql2 = "update users set securityQuestion=?,answer=? where email=? and password=?";
try(Connection connection = ConnectionProvider.getConnection();
		Statement statement = connection.createStatement();
		PreparedStatement preparedStatement = connection.prepareStatement(sql2))
{
	ResultSet rs = statement.executeQuery(sql1);
	while(rs.next())
	{
		check=1;
		preparedStatement.setString(1,newSecurityQuestion);
		preparedStatement.setString(2, newAnswer);
		preparedStatement.setString(3, email);
		preparedStatement.setString(4, password);
		preparedStatement.executeUpdate();
		response.sendRedirect("changeSecurityQuestion.jsp?msg=updated");
	}
	if(check==0)
	{
		response.sendRedirect("changeSecurityQuestion.jsp?msg=wrong");
	}
}
catch(Exception e)
{
	e.printStackTrace();
	response.sendRedirect("changeSecurityQuestion.jsp?msg=invalid");
}
%>