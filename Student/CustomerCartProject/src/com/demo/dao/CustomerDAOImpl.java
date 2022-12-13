package com.demo.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.demo.beans.Cart;
import com.demo.beans.Customer;

public class CustomerDAOImpl implements CustomerDAO{

	//Customer cu=new Customer();
	//Cart ct=new Cart();

	static Map<Customer,List<Cart>> cmap;

	static {
		cmap=new HashMap<Customer,List<Cart>>();
		List<Cart>clist1=Arrays.asList(new Cart(1,"laptop",35000f),new Cart(2,"Mobile",15000f));
		cmap.put(new Customer(1,"Suraj"), clist1);
		List<Cart>clist2=Arrays.asList(new Cart(3,"Camera",55000f),new Cart(4,"Ipad",95000f));
		cmap.put(new Customer(2,"Akash"), clist2);
	}

	@Override
	public boolean addCustomer(Customer cu, List<Cart> lst) {
		cmap.put(cu, lst);
		return true; 
	}

	@Override
	public List<Cart> searchByCustomer(String cname) {
		return cmap.get(cname);
	}

	@Override
	public List<Customer> searchByProduct(String pname) {
		List<Customer>customer=new ArrayList<>();
		for(Entry<Customer,List<Cart>> e :cmap.entrySet()) {
			if(e.getValue().contains(pname)) {
				customer.add(e.getKey());
			}
		}
		if(customer.size()>0) {
			return customer;
		}
		return null;
	}

	//	@Override
	//	public List<String> searchByCustomer(String cname) {
	//		List<String>lst=new ArrayList<>();
	//		for(Entry<Customer, List<Cart>> e: cmap.entrySet()) {
	//			e.getValue().equals(cname);
	//		}
	//		return null;
	//	}









}
