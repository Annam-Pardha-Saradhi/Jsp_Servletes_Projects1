<%@page import="com.project.connectionprovider.ConnectionProvider"%>
<%@page import="java.sql.*"%>

<%
if(session.getAttribute("email")==null)
{
	response.sendRedirect("login.jsp");
}
if(session.getAttribute("email")!=null)
{
String email = session.getAttribute("email").toString();
String address = request.getParameter("address"); 
String city = request.getParameter("city");
String state = request.getParameter("state"); 
String country = request.getParameter("country"); 
String paymentMethod = request.getParameter("paymentMethod");
String transactionId = request.getParameter("transactionId");
String mobileNumber = request.getParameter("mobileNumber");
String status="bill";
try
{
	Connection connection=ConnectionProvider.getConnection();
	String query1 = "update users set address=?,city=?,state=?,country=?,mobileNumber=? where email=?";
	PreparedStatement preparedStatement1 = connection.prepareStatement(query1);
	preparedStatement1.setString(1, address);
	preparedStatement1.setString(2, city);
	preparedStatement1.setString(3, state);
	preparedStatement1.setString(4, country);
	preparedStatement1.setString(5, mobileNumber);
	preparedStatement1.setString(6, email);
	preparedStatement1.executeUpdate();
	preparedStatement1.close();
	
	String query2 = "update cart set address=?,city=?,state=?,country=?,mobileNumber=?,orderDate=now(),deliveryDate=DATE_ADD(orderDate,INTERVAL 7 Day),paymentMethod=?,transactionId=?,status=? where email=? and address is null";
	PreparedStatement preparedStatement2 = connection.prepareStatement(query2);
	preparedStatement2.setString(1, address);
	preparedStatement2.setString(2, city);
	preparedStatement2.setString(3, state);
	preparedStatement2.setString(4, country);
	preparedStatement2.setString(5, mobileNumber);
	preparedStatement2.setString(6, paymentMethod);
	preparedStatement2.setString(7, transactionId);
	preparedStatement2.setString(8, status);
	preparedStatement2.setString(9, email);
	preparedStatement2.executeUpdate();
	preparedStatement2.close();
	response.sendRedirect("bill.jsp");
}
catch(Exception e)
{
	e.printStackTrace();
}
}
%>