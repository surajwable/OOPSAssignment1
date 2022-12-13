package com.demo.thread;

import com.demo.beans.MyNumFunctions;

public class MyPrimeThread extends Thread{
	private MyNumFunctions ob;
	private int n;
	public MyPrimeThread(MyNumFunctions ob, int n) {
		this.ob=ob;
		this.n=n;
		
	}
	
    public void run(){
    	boolean flag=ob.checkPrime(n);
		System.out.println("Prime number :"+n+"---->"+flag);
    }
}
