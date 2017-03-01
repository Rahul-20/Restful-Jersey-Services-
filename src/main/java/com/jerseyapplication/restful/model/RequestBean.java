package com.jerseyapplication.restful.model;

/*import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)*/
public class RequestBean 
{
	private String UserName;
	private String Password;
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String UserName) {
		System.out.println("userName::::::::"+UserName);
		this.UserName = UserName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String Password) {
		System.out.println("password:::::::::::"+Password);
		this.Password = Password;
	}
	//Request Object Name and Setter Name both should be same
	//Eg:-{"UserName":"Rahul","Password":"Rahul"}
}
