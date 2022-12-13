package com.demo.service;

import java.util.List;

import com.demo.beans.Cart;
import com.demo.beans.Customer;

public interface CustomerService {

	boolean inputCustomer();

	List<Cart> findbyCustomer(String cname);

	List<Customer> findByProduct(String pname);
}
