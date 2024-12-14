package com.project.connectionprovider;
import java.sql.*;

public class ConnectionProvider {
	private static String driver="com.mysql.cj.jdbc.Driver";
	private static String url="jdbc:mysql://localhost:3306/online_shopping_project";
	private static String user="root";
	private static String password="root";
	public static Connection getConnection()
	{
		Connection connection=null;
		try
		{
			Class.forName(driver);
			connection = DriverManager.getConnection(url,user,password);
			return connection;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return connection;
		}
	}
}
