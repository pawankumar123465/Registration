package pojo;

public class Product 
{
	private Integer productid;
	private Integer price;
	private String username;
	public Integer getProductid() {
		return productid;
	}
	public void setProductid(Integer productid) {
		this.productid = productid;
	}
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
	public Product(Integer productid, Integer price, String username) {
		super();
		this.productid = productid;
		this.price = price;
		this.username = username;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
