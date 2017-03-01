package com.jerseyapplication.restful.dao.impl;


import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jerseyapplication.restful.dao.LoginDAO;
import com.jerseyapplication.restful.entity.LoginEntity;

@Repository
public class LoginDAOImpl implements LoginDAO
{
	@Autowired
	private SessionFactory sessionFactory;   

	@Transactional
	public LoginEntity ValidateUserNameAndPassword(String UserName,String Password) 
	{
		org.hibernate.Query query=sessionFactory.getCurrentSession().getNamedQuery("ValidateUserAndPassowrd");
		System.out.println("query:::::::::::::::::::::::"+query);
		query.setParameter("UserName",UserName);
		query.setParameter("Password",Password);
		System.out.println("query:::::::::::::::::::::::"+query);
		System.out.println("::::::::::::::::::::::::::::::::"+query.list().toArray());
		LoginEntity res=(LoginEntity)query.uniqueResult();
		return res;
	}
}
