package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Customer;
import com.demo.service.CustomerService;
import com.demo.service.CustomerServiceImpl;

public class TestCustomerCartManagement {

	public static void main(String[] args) {

		CustomerService cservice=new CustomerServiceImpl();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("1.Add new CustomerwithCart"
				+ "\n2.Find Items from the Cart using customer name"
				+ "\n3.Display which item is present in multiple customers cart"
				+ "\n4.Display All"
				+ "\n5.");
		choice=sc.nextInt();
		switch(choice) {
		case 1://Add new CustomerwithCart
			boolean status=cservice.inputCustomer();
			if(status)System.out.println("Cusomer and cart added successfully");
			else System.out.println("Not added");
			break;
			
		case 5:System.out.println("Thank you for visiting ..!!");
		sc.close();	
		break;
		}
		}while(choice!=5);
				
	}

}
