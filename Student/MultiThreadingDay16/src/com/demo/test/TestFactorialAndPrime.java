package com.demo.test;

import java.util.Scanner;

import com.demo.beans.MyNumFunctions;
import com.demo.thread.MyFactorialThread;
import com.demo.thread.MyPrimeThread;

public class TestFactorialAndPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MyFactorialThread[] farr=new MyFactorialThread[5];
		MyPrimeThread[] carr=new MyPrimeThread[5];
		MyNumFunctions ob=new MyNumFunctions();
//		for(int i=0;i<5;i++) {
//			System.out.println("enetr number");
//			int n=sc.nextInt();
					
			farr[0]=new MyFactorialThread(ob, 3);
			farr[0].start();
			farr[1]=new MyFactorialThread(ob, 4);  
			farr[1].start();
			farr[2]=new MyFactorialThread(ob, 5); 
			farr[2].start();
			farr[3]=new MyFactorialThread(ob, 6); 
			farr[3].start();
			farr[4]=new MyFactorialThread(ob, 7);  
			farr[4].start();
//			for(int i=0;i<5;i++) {
//			farr[i].start();
//			}
			carr[0]=new MyPrimeThread(ob, 1); 
			carr[0].start();
			carr[1]=new MyPrimeThread(ob, 2); 
			carr[1].start();
			carr[2]=new MyPrimeThread(ob, 3); 
			carr[2].start();
			carr[3]=new MyPrimeThread(ob, 4); 
			carr[3].start();
			carr[4]=new MyPrimeThread(ob, 5); 
			carr[4].start();
			
//			for(int i=0;i<5;i++) {
//				carr[i].start();
//				}
//		}
		for(int i=0;i<farr.length;i++) {
			try {
				carr[i].join();
				farr[i].join();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		//farr[0].start();

	}

}
