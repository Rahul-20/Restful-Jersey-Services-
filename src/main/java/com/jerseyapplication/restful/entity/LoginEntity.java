package com.jerseyapplication.restful.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries(
		
		{ @NamedQuery(name = "ValidateUserAndPassowrd", query = "from LoginEntity L where L.UserName= :UserName and L.Password= :Password") }
		
		
		)

@Entity
@Table(name="Login")
public class LoginEntity 
{
	@Id
	@Column(name="UserName")
	private String UserName;
	@Column(name="Password")
	private String Password;
	
	public void setPassword(String pwd)
	{
		this.Password=pwd;
	}

	public void setUserName(String usrName)
	{
		this.UserName=usrName;
	}

	public String getUserName()
	{
		return UserName;
	}

	public String getPassword() 
	{
		return Password;
	}
}
