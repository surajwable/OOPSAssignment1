package com.demo.service;
import java.util.List;

import com.demo.beans.Product;

public interface ProductService {
	
	void addnewproduct();
	
	Product findbyname(String name);
	
	Product remove(int id);
	
	List<Product> displayall();
	
	List <Product> findbyqty(int qty);
	
	List<Product> sortbyprice();
	
	Product findById(int id);
	
	boolean removebyname(String name);
	
	boolean removebyid(int id);

	boolean modifyprice(int id, float pr);

}
