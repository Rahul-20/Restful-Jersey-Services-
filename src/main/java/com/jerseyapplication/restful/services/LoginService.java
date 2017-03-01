package com.jerseyapplication.restful.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jerseyapplication.restful.dao.LoginDAO;
import com.jerseyapplication.restful.entity.LoginEntity;
import com.jerseyapplication.restful.model.ResponseBean;

@Service
public class LoginService 
{
	@Autowired
	LoginDAO loginDAO;
	

	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.READ_COMMITTED,rollbackFor=Exception.class)
	public ResponseBean validateLogin(String UsrName,String Pwd)
	{
		System.out.println("I am in Login Service validateLogin Method");
		ResponseBean res=new ResponseBean();
		System.out.println("I am in LoginService Class(UsrName):::::::::::::::::"+UsrName);
		System.out.println("I am in LoginService Class(Pwd):::::::::::::::::"+Pwd);
		System.out.println("Before calling DAO checking for Object:::::::::::::::::"+loginDAO);
		LoginEntity le=loginDAO.ValidateUserNameAndPassword(UsrName,Pwd);
		System.out.println("Got the Entity Object::::::::::::"+le);
		if(le!=null)
		{
			res.setMsg("User Authentication Success");
			res.setUserName(le.getUserName());
		}
		else
		{
			res.setMsg("Invalid User");
			res.setUserName(UsrName);
		}
		return res;
	}
}
