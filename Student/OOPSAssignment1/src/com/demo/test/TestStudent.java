package com.demo.test;

import com.demo.beans.MscStudent;
import com.demo.beans.PhdStudent;

public class TestStudent {

	public static void main(String[] args) {
		MscStudent m1=new MscStudent(1,"suraj","pune",90,98,92);
		MscStudent m2=new MscStudent(2,"akash","satara",93,98,96);
		MscStudent m3=new MscStudent(3,"pritam","sangli",90,80,92);
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println("Percentage of M1 :"+m1.calculatePer());
		System.out.println("Percentage of M2 :"+m2.calculatePer());
		System.out.println("Percentage of M3 :"+m3.calculatePer());
		System.out.println("************************");
		
		PhdStudent p1=new PhdStudent(4,"vaibhav","nagar",85,78,85,84);
		PhdStudent p2=new PhdStudent(5,"sourabh","sangli",82,78,56,84);
		PhdStudent p3=new PhdStudent(6,"ekka","mp",85,78,85,67);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println("Percentage of p1 :"+p1.calculatePer());
		System.out.println("Percentage of p2 :"+p2.calculatePer());
		System.out.println("Percentage of p3 :"+p3.calculatePer());
	}

}
