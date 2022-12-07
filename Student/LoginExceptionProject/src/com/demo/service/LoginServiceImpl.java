package com.demo.service;

import java.util.Scanner;

import com.demo.dao.LoginDAO;
import com.demo.dao.LoginDAOImpl;
import com.demo.exceptions.WrongCredentialsException;

public class LoginServiceImpl implements LoginService {

private LoginDAO ldao;

	public LoginServiceImpl() {
		ldao=new LoginDAOImpl();
	}
	
	@Override
	public boolean addNewUser() throws WrongCredentialsException{
		for(int i=0;i<3;i++) {
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter Name");
		String name=sc.next();
		System.out.println("enter password");
		String password=sc.next();
		return ldao.addUser(name,password);
		}
		catch(WrongCredentialsException e) {
			System.out.println("handling in service layer");
			if (i==2)
			  throw e;
		}
	}
		return false;
}
}
