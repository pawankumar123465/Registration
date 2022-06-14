package actionPackage;

import dao.ProductDao;

public class DeleteAction
{
	private Integer productid;

	public Integer getProductid() {
		return productid;
	}

	public void setProductid(Integer productid) {
		this.productid = productid;
	}
	public String execute()
	{
		ProductDao productDao = new ProductDao();
		int i=productDao.deleteProduct(productid);
		if(i==0)
			return "error";
		return "success";
		
	}

}
