package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dbUtil.DbUtil;
import pojo.Login;

public class loginDao  
{
	
	
	
	
	
	
	
	public static Boolean isValidUser(Login user)
	{
		System.out.println("hello testing");
		PreparedStatement statement;
		Boolean isvalid= false;
		Connection connection=null;
		
		
		
		try 
		{
			connection=DbUtil.getConnection();
			String sql="select * from login where username=? and password=?";
			statement=connection.prepareStatement(sql);
			statement.setString(1, user.getUsername());
			statement.setString(2, user.getPassword());
			ResultSet resultSet=statement.executeQuery();
			
			while(resultSet.next())
			{
				isvalid=true;
			}
			
		}
		catch (Exception e)
		{
			System.out.println(" error occusred"+e.getMessage());
			
			// TODO: handle exception
		}
		finally
		{
			DbUtil.closeConnection(connection);
			
		}
		
		return isvalid;
	}

	
}
