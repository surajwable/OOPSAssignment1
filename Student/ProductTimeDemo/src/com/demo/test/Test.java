package com.demo.test;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import com.demo.beans.Product;

public class Test {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		Product parr[]=new Product[2];
		
		System.out.println("enter product Id");
		int proid=sc.nextInt();
		System.out.println("enter product name");
		String proname=sc.next();
		System.out.println("enter expiry date in (dd/mm/yyyy)");
		String expdate=sc.next();
		
		//converting String to date
		
		
		
		
		
	}

}