package Interceptors;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class LoginInterceptor implements Interceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() 
	{
		System.out.println("login destroy called");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() 
	{
		System.out.println("login init called");
		// TODO Auto-generated method stub
		
	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception 
	{
		Object login=ServletActionContext.getRequest().getSession().getAttribute("loggedInUser");
		if(login==null)
		{
			if(arg0.getAction().getClass().equals("LoginAction.class"))
			{
				return arg0.invoke();
			}
			return "input";
		}
		// TODO Auto-generated method stub
		return arg0.invoke();
	}

}
