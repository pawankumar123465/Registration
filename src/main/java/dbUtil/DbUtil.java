package dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import pojo.Product;

public class DbUtil 
{

	
	public static Connection getConnection() throws Exception
	{
		Connection connection=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/web_student_tracker","root","Ravan@007");
			
			
		}
		catch (Exception e) 
		{
			System.out.println("error occured  "+e.getMessage());
			// TODO: handle exception
		}
		return connection;
		
	}
	public static  void closeConnection(Connection connection)
	{
		try {

			connection.close();
			
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			// TODO: handle exception
		}		
	}


}
