package com.demo.dao;

import com.demo.exceptions.WrongCredentialsException;

public interface LoginDAO {

	boolean addUser(String name, String password)throws WrongCredentialsException;

	
}
