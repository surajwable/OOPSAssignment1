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
		//making an object having reference variable of Interface and object of Scanner
		ProductService pservice=new ProductServiceImpl();
		int choice;
		do {
			System.out.println("**************************MENU***********************");
			System.out.println("1.add new product\n2.remove by id\n3.remove by name\n");
			System.out.println("4.display all\n5.find by id\n6.sort by price\n");
			System.out.println("7.display all with qty > given qty\n8.modify price\n9.find by name 10.exit\n ");
			System.out.println("choice :");
			choice=sc.nextInt();
			switch(choice) {
			case 1://add new Product
				pservice.addnewproduct();
				break;
				
			case 2://remove by using id
				System.out.println("enter the id");
				int id=sc.nextInt();
				boolean status=pservice.removebyid(id);
				if(status) {
					System.out.println("removed successfully usiing id");
				}
				else {
					
				}
				break;
				
			case 3://remove by name
				System.out.println("enter name to remove");
				String name=sc.next();
				status = pservice.removebyname(name);
				if(status) {
					System.out.println("Removed Successfully");
				}
				else {
					System.out.println("not found");
				}
				break;
				
			case 4://display all
				List<Product>plist=pservice.displayall();
				Iterator<Product>it=plist.iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}
				break;
				
			case 5://find by id
				System.out.println("enter id");
				int id1=sc.nextInt();
				Product p=pservice.findById(id1);
				if(p!=null) {
					System.out.println(p);
				}
				else {
					System.out.println("Not Found");
				}
				break;
				
			case 6://sort by price
				//will have to sort by using comparable
				List<Product>plist1=pservice.sortbyprice();
				//sorted list will be saved here in the plist1
				if(plist1!=null) {
					for(Product p2:plist1) {
						System.out.println(p2);
					}
				}
				break;
				
			case 7://Display with Quantity
				System.out.println("Enter Quanity of products");
				int qty=sc.nextInt();
				List<Product>pdata=pservice.findbyqty(qty);
				
				break;
				
			case 8://modify Price
				System.out.println("enetr id");
				 id=sc.nextInt();
				 System.out.println("enter new price");
				float pr=sc.nextFloat();
				status=pservice.modifyprice(id,pr);
				if(status) {
					System.out.println("modified successfully");
				}
				else {
					System.out.println("not found");
				}
				break;
			
			case 9://find by name
				System.out.println("enter name");
				String name1=sc.next();
				Product n1=pservice.findbyname(name1);
				if(n1!=null) {
					System.out.println(n1);
				}
				else {
					System.out.println("not found");
				}
				break;
				
			case 10://exit
				System.out.println("thank you for visiting");
				sc.close();
				break;
			}
	}while(choice!=10);
	}
}
