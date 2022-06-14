package actionPackage;

import dao.ProductDao;
import pojo.Product;

public class SaveUpdateAction 
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getProductid() {
		return productid;
	}
	public void setProductid(Integer productid) {
		this.productid = productid;
	}
	public String execute()
	{
		Product p = new Product(productid, price, username);
		ProductDao productDao= new ProductDao();
		int i=productDao.saveChanges(p);
		if(i==0)
			return "error";
		
		return "success";
	}

}
