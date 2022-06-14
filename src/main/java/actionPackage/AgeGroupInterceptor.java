package actionPackage;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;

import freemarker.core.ReturnInstruction.Return;

public class AgeGroupInterceptor implements Interceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() 
	{
		System.out.println("age group interceptor destroy");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() 
	{
		System.out.println("init age group interceptor");
		// TODO Auto-generated method stub
		
	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(" age group preprocession");
		ValueStack stack=arg0.getStack();
		Integer age=(Integer) stack.findValue("age");
		String ageGroup="";
		if(age<18)
		{
			ageGroup="child";
					
			
		}
		else if(age>=18 && age<58)
		{
			ageGroup="Adult";
		}
		else
		{
			ageGroup="adult";
			
		}
		stack.set("age",age+ "(" +ageGroup+ ")");
		String result=arg0.invoke();
			
		
		System.out.println(" age group postProcessing");
		return result;
	}

}
