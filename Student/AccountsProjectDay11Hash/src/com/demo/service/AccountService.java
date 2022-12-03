package com.demo.service;

import java.util.List;
import java.util.Set;

import com.demo.beans.Account;

public interface AccountService {
//
//	void displayAccount();
//
//	void addAccount();

	List<Account> getTopNAccounts(int n);

	Set<Account> getAll();

}
