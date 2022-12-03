package com.demo.service;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Account;
import com.demo.dao.AccountDAO;
import com.demo.dao.AccountDAOImpl;

public class AccountServiceImpl implements AccountService{
	Scanner sc=new Scanner(System.in);
	List<Account>lt;
	private AccountDAO accdao;
	
	public AccountServiceImpl() {
		super();
		this.accdao=new AccountDAOImpl();
	}
	
	@Override
	public List<Account> getTopNAccounts(int n) {
		return accdao.getTopNAcc(n);
	}

	@Override
	public Set<Account> getAll() {
		return accdao.showAll() ;
	}
	
	

}
