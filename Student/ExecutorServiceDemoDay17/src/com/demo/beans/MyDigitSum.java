package com.demo.beans;

import java.util.concurrent.Callable;

public class MyDigitSum implements Callable<String>{

	private int num;

	public MyDigitSum(int num) {
		super();
		this.num = num;
	}
	
	public String call() throws Exception{
		int sum=0;
		int num1=num;
		while(num>0) {
			int r=num%10;
			sum=sum+r;
			num=num/10;
		}
		System.out.println("Thread :"+Thread.currentThread().getId());
		return "sum of digits of"+num1+"="+sum;
	}
}
