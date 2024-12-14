package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	
	public LoginDao()
	{
		
	}
	
	public boolean validateLogin(String uname,String pwd) throws ClassNotFoundException
	{
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/serveletpractice";
		String user = "root";
		String password = "root";
		
		Class.forName(driver);
		
		try(Connection connection = DriverManager.getConnection(url, user,password))
		{
			PreparedStatement preparedStatement = connection.prepareStatement("select * from employee where username=? and password=?");
			preparedStatement.setString(1, uname);
			preparedStatement.setString(2, pwd);
			ResultSet resultset=preparedStatement.executeQuery();
			return resultset.next();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

}