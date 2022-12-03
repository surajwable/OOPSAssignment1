package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.beans.Account;

public interface AccountDAO {

	List<Account> getTopNAcc(int n);

	Set<Account> showAll();

}
