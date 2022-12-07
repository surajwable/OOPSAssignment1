package com.demo.service;

import com.demo.exceptions.WrongCredentialsException;

public interface LoginService {

	boolean addNewUser() throws WrongCredentialsException;

}
