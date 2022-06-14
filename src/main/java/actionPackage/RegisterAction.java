package actionPackage;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String lastName;
	private String firstName;
	private String gender;
	private Integer age;
	private String email;
	private String address;
	private String subject;
	private String color;
	private Boolean selected;

	public Boolean getSelected()
	{
		System.out.println();
		return selected;
	}

	public void setSelected(Boolean selected) 
	{
		System.out.println("selected"+selected);
		this.selected = selected;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String execute()
	{
		System.out.println("execute() methode");
		return "welcome";
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public void validate() {
		if(firstName.equals(""))
		{
			addFieldError("firstName", "field is required");
		}
		if(lastName.equals("")) {
			addFieldError("lastName", "filed is required");
		}
		if(gender== null)
		{
			addFieldError("gender", "filed is required");
		}
		if(age==null)
		{
			addFieldError("age", "filed is required");
		}
		if(email.equals(""))
		{
			addFieldError("email", "filed is required");
		}
}
	

	

}
