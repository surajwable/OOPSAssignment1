package com.demo.test;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

public class TestProductManagement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ProductService pservice=new ProductServiceImpl(); 
		int choice=0;
		do {
		System.out.println("1. add new product\n2. remove by id\n 3. remove by name\n");
		System.out.println("4. display all\n5.find by id\n 6. sort by price\n");
		System.out.println("7. display all with qty > given qty\n8.modify price\n9.find by name 10.exit\n ");
		System.out.println("choice :");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			pservice.addNewProduct();
			break;
		case 5:
			System.out.println("enter id to search");
			int id=sc.nextInt();
			Product p=pservice.findById(id);
			if(p!=null) {
				System.out.println(p);
			}
			else {
				System.out.println("not found");
			}
			break;
		case 4:
			List<Product> plist=pservice.displayAll();
			Iterator<Product> it=plist.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			
			break;
		case 9:
			System.out.println("enetr name");
			String nm=sc.next();
			Product p=pservice.findByName(nm);
			if(p!=null) {
				System.out.println(p);
			}
			else {
				System.out.println("not found");
			}
			break;
		case 10:
			System.out.println("thank you for visiting....");
			sc.close();
		}
		}while(choice!=10);
	}

}
