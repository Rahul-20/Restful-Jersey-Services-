package com.jerseyapplication.restful.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jerseyapplication.restful.model.RequestBean;
import com.jerseyapplication.restful.model.ResponseBean;
import com.jerseyapplication.restful.services.LoginService;
import com.sun.jersey.spi.resource.Singleton;

@Path(value = "/login")
@Singleton
@Component
public class LoginResource
{
	@Autowired
	LoginService loginService;
	
	@Path(value="/validate")
	//@GET
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseBean authentication(RequestBean req)
	{
		System.out.println("I am in Resources Class Login Method");
		String UsrName=req.getUserName();
		String Pwd=req.getPassword();
		System.out.println("I am in LoginResource Class:::::::::::(UsrName)"+UsrName);
		System.out.println("I am in LoginResource Class:::::::::::(Pwd)"+Pwd);
		System.out.println("Before Calling Checking For Login Service Object:::::::::::"+loginService);
		return loginService.validateLogin(UsrName, Pwd);
	}
}
