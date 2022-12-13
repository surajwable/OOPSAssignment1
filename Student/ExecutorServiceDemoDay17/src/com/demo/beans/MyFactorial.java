package com.demo.beans;

import java.util.concurrent.Callable;

public class MyFactorial implements Callable<String>{

	private int num;
	
	public MyFactorial(int num) {
		super();
		this.num = num;
	}

	@Override
	public String call() throws Exception {
		int f=1;
		for(int i=2;i<=num;i++) {
			f=f*i;
		}
		System.out.println("Thread :"+Thread.currentThread().getId());
		return "Factorial of:"+num+"-->"+f;
	}

	
}
