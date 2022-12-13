package com.demo.thread;

import com.demo.beans.MyNumFunctions;

public class PrimeThread extends Thread{
	
	private MyNumFunctions ob;
	private int n;
	
	public PrimeThread(MyNumFunctions ob,int n) {
		this.ob=ob;
		this.n=n;
	}
	
	public void run() {
		boolean flag=ob.primeNum(n);
		System.out.println("Prime Number:"+n+"--->"+flag);
	}

}
