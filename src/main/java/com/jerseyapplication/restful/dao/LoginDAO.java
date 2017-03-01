package com.jerseyapplication.restful.dao;

import com.jerseyapplication.restful.entity.LoginEntity;

public interface LoginDAO 
{
	public LoginEntity ValidateUserNameAndPassword(String UserName,String Passowrd);
}
