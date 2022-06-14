package actionPackage;

import dao.ProductDao;
import pojo.Product;

public class UpdateProductAction 
{
	private Integer price;
	private String username;
	private Integer productid;
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getProductid() {
		return productid;
	}
	public void setProductid(Integer productid) {
		this.productid = productid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String execute()
	{
		//System.out.println("update product action  " +productid);
		ProductDao productDao= new ProductDao();
		Product p=productDao.getProductByid(productid);
		productid=p.getProductid();
		price=p.getPrice();
		username=p.getUsername();
		return  "success";
	}
	
	

}
