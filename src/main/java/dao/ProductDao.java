package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import actionPackage.Session;
import dbUtil.DbUtil;
import pojo.Product;

public class ProductDao extends Session
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<Product> list=new ArrayList<Product>();

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;

	public  List<Product> allproduct()
	{
		
		
		Connection connection=null;
		PreparedStatement statement=null;
		try 
		{
			connection=DbUtil.getConnection();

		//	System.out.println("direct "+getSession().get("user").toString());

			
			
			
			String sql="select * from product";
			statement=connection.prepareStatement(sql);
			ResultSet resultSet=statement.executeQuery();
			while(resultSet.next())
			{
				list.add(new Product(resultSet.getInt(1), resultSet.getInt(2), resultSet.getString(3)));
				
			}
			
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		finally 
		{
			DbUtil.closeConnection(connection);	
		}
		return list;
	}
	public int addNewProduct(Product p)
	{
		Connection connection=null;
		PreparedStatement statement;
		int i=0;
		
		try
		{
			connection=DbUtil.getConnection();
			String sql="insert into product value(?,?,?)";
			statement=connection.prepareStatement(sql);
			statement.setInt(1,p.getProductid());
			statement.setInt(2,p.getPrice());
			statement.setString(3,p.getUsername());
			i=(int)statement.executeUpdate();
			
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		finally 
		{
			DbUtil.closeConnection(connection);
			
		}
		return i;
	}
	public Product getProductByid(Integer id)
	{
		Product p = null;
		Connection connection=null;
		try
		{
			connection= DbUtil.getConnection();
			String sql="select * from product where productid=?";
			PreparedStatement statement;
			statement=connection.prepareStatement(sql);
			statement.setInt(1, id);
			ResultSet resultSet=statement.executeQuery();
			while(resultSet.next())
			{
				
				p=new Product(resultSet.getInt(1), resultSet.getInt(2), resultSet.getString(3));
				//System.out.println("hello2"+resultSet.getInt(1)+"  "+ resultSet.getInt(2)+"  "+ resultSet.getString(3));
			}
			
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		finally {
			DbUtil.closeConnection(connection);
		}
		return p;
	}
	public int saveChanges(Product p)
	{
		Connection connection=null;
		try
		{
			connection= DbUtil.getConnection();
			String sql="Update product set price =? ,username=? where productid=?";
			PreparedStatement statement;
			statement=connection.prepareStatement(sql);
			statement.setInt(1, p.getPrice());
			statement.setString(2,p.getUsername());
			statement.setInt(3, p.getProductid());
			return statement.executeUpdate();
			
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		finally {
			DbUtil.closeConnection(connection);
		}
		return 0;
		// TODO Auto-generated method stub
		
	}
	public int deleteProduct(Integer productid) {
		// TODO Auto-generated method stub
		Connection connection= null;
		try
		{
			connection=DbUtil.getConnection();
			String s="Delete from product where productid=?";
			PreparedStatement statement;
			statement=connection.prepareStatement(s);
			statement.setInt(1, productid);
			return statement.executeUpdate();
			
		}
	
		catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			DbUtil.closeConnection(connection);
		}
		return 0;
	}
	

}
