package com.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Product;

public class ProductServiceImpl implements ProductService{
	static List<Product> plist;
	static{
		plist=new ArrayList<>();
		plist.add(new Product(1,"chair",12,3456));
		plist.add(new Product(2,"Table",34,2000));
	}
	@Override
	public void addNewProduct() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr id");
		int id=sc.nextInt();
		System.out.println("enetr name");
		String nm=sc.next();
		System.out.println("enetr qty");
		int qty=sc.nextInt();
		System.out.println("enetr price");
		float pr=sc.nextFloat();
		Product p=new Product(id,nm,qty,pr);
		plist.add(p);
		
	}
	@Override
	public List<Product> displayAll() {
		if(plist.size()>0) {
		 return plist;
		}
		return null;
	}
	@Override
	public Product findById(int id) {
		int pos=plist.indexOf(new Product(id));
		if(pos!=-1) {
			return plist.get(pos);
		}
		return null;
	}
	@Override
	public Product findByName(String nm) {
		for(Product p:plist) {
			if(p.getName().equals(nm)) {
				return p;
			}
		}
		return null;
	}

}
