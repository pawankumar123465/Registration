package pojo;

public class Login 
{
	@Override
	public String toString() {
		return "Login [username=" + username + ", password=" + password + "]";
	}
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Login(String username, String password) {
		super();
		this.username = username;
		this.password = password;
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

}
