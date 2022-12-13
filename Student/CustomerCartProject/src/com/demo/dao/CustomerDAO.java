package com.demo.dao;

import java.util.List;

import com.demo.beans.Cart;
import com.demo.beans.Customer;

public interface CustomerDAO {

	boolean addCustomer(Customer cu, List<Cart> lst);

	List<Cart> searchByCustomer(String cname);

	List<Customer> searchByProduct(String pname);

}
