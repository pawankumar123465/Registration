package actionPackage;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class Session extends ActionSupport implements SessionAware
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Map<String ,Object> session = new HashMap<String, Object>();
	@Override
	public void setSession(Map<String, Object> arg0) 
	{
		this.session=arg0;	
	
	}
	
	public  Map<String ,Object> getSession()
	{
		return session;
	}


}
