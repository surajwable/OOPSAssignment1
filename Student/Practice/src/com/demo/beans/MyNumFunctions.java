package com.demo.beans;

public class MyNumFunctions {

	public boolean primeNum(int n) {
		for(int i=2;i<=n;i++) {
		try {
			Thread.sleep(500);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		if(n%i==0) {
			return false;
		}
		}
		return true;
	}
	
	public int factorial(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
//			try {
//				Thread.sleep(500);
//			}
//			catch(InterruptedException e) {
//				e.printStackTrace();
//			}
		
		}
		return f;
	}
}
