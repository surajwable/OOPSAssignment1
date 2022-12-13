package com.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Cart;
import com.demo.beans.Customer;
import com.demo.dao.CustomerDAO;
import com.demo.dao.CustomerDAOImpl;

public class CustomerServiceImpl implements CustomerService {
	static Scanner sc = new Scanner(System.in);
	private CustomerDAO cdao;

	public CustomerServiceImpl() {
		super();
		cdao=new CustomerDAOImpl();
	}
	@Override
	public boolean inputCustomer() {

		System.out.print("Please enter Customer Id: ");
		int cid=sc.nextInt();
		System.out.println("Please enter Customer name");
		String cname = sc.next();
		Customer cu=new Customer(cid,cname);
		List<Cart> lst = new ArrayList<>();
		char ans;
		do {
			System.out.print("Please enter ItemId: ");
			int iid= sc.nextInt();
			System.out.println("Enter Product Name");
			String iname=sc.next();
			System.out.println("Enter Product Price");
			float iprice=sc.nextFloat();
			//creating an object of product
			Cart ca=new Cart(iid,iname,iprice);
			//adding product in a list
			lst.add(ca);
			System.out.println("Do you want to Continue Y/N");
			ans=sc.next().charAt(0);
		}while(ans=='Y');
		//returning object of customer and list of product
		return cdao.addCustomer(cu,lst);
	}
	
	@Override
	public List<Cart> findbyCustomer(String cname) {
		return cdao.searchByCustomer(cname);
	}
	@Override
	public List<Customer> findByProduct(String pname) {
		return cdao.searchByProduct(pname);
		
	}
}
