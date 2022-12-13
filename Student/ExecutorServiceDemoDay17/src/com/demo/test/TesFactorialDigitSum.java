package com.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import com.demo.beans.MyDigitSum;
import com.demo.beans.MyFactorial;

public class TesFactorialDigitSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ExecutorService es=Executors.newFixedThreadPool(4);
		List<Future>flist=new ArrayList<>();
		for(int i=0;i<=3;i++) {
			int num;
			num=sc.nextInt();
			MyDigitSum sum=new MyDigitSum(num);
			MyFactorial fact=new MyFactorial(num);
			
			Future<String>f=es.submit(sum);
			Future<String>f1=es.submit(fact);
			flist.add(f1);
			flist.add(f);
		}
		//to display the o/p
		for(Future<String>f:flist) {
			try {
				System.out.println(f.get());
			}catch(InterruptedException| ExecutionException e) {
				e.printStackTrace();
				sc.close();
			}
		}
		
		try {
			es.awaitTermination(2000,TimeUnit.MILLISECONDS);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}		
	}
}
