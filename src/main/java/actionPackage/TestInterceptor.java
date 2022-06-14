package actionPackage;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class TestInterceptor implements Interceptor
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("testdestroy");
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("test init");
		
	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("test preposessing");
		String s=arg0.invoke();
		System.out.println("test postprocessing");
		return s;
	}

}
