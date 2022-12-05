package com.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Cart;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public boolean inputCustomer() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter Customer Id: ");
		int cid=sc.nextInt();
		System.out.println("Please enter Customer name");
		String cname = sc.next();
		
		List<Cart> lst = new ArrayList<>();
		char ans;
		do {
			System.out.print("Please enter ItemId: ");
			String iid= sc.next();
			lst.addAll(iid);
			System.out.print("Do you want to continue? (y/n) :");
			ans = sc.next().charAt(0);
		}while(ans=='y');
		return cdao.addNewEntry(city, lst);
	}

}
