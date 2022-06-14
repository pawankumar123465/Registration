package actionPackage;

import dao.ProductDao;
import dbUtil.DbUtil;
import pojo.Product;

public class AddNewProductAction 
{
	String t="hihehello";
	
	private String username;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	private Integer price;
	private Integer id;
	public String execute()
	{
		Product p= new Product(id, price, username);
		ProductDao productDao=new ProductDao();
		
		int statusCode=0;
		statusCode=productDao.addNewProduct(p);
		if(statusCode==1)
			return "success";
		else
			return "error";
		
	}
	

}
