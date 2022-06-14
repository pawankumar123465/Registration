package actionPackage;

import java.util.ArrayList;
import java.util.List;

import dao.ProductDao;
import pojo.Login;
import pojo.Product;

public class ShowProductAction extends Session
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<Product> list=new ArrayList<Product>();
	Login user=null;
	public List<Product> getList() {
		return list;
	}
	public Login getUser() 
	{
		
		return user;
	}
	public void setUser(Login user) 
	{
		this.user = user;
	}
	public void setList(List<Product> list) {
		this.list = list;
	}

	public String execute()
	{
		
		user=(Login) getSession().get("user");
		setUser(user);
		//System.out.println(user.getUsername()+"showPro");
		ProductDao productDao= new ProductDao();
		list=productDao.allproduct();
		return "success";
	}

}
