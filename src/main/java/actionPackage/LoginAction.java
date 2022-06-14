package actionPackage;

import org.apache.struts2.ServletActionContext;

import dao.loginDao;
import pojo.Login;

public class LoginAction  extends Session
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String username;
	String password;
	
	


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

		
	public String execute()
	{
		ServletActionContext.getRequest().getSession().setAttribute("loggedInUser", username);
		Login user=new Login(username,password);
		getSession().put("user",user);
		String statusCode;
		//System.out.println("Login Action  "+username);
		if(loginDao.isValidUser(user))
		{
			statusCode="success";
			
		}
		else
		{
			statusCode="input";
		}
		return statusCode;
			
	}
}
