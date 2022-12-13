package com.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import com.demo.beans.MyTask;

public class TestExecutorService {

	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(4);
		List<Future> flist=new ArrayList<>();
		//breaking task into small portions
		for(int i=1;i<=91;i=i+10) {     
			MyTask t=new MyTask(i,i+9);  
			//giving callable object t to and store into the future
			Future<Integer> f=es.submit(t);
			flist.add(f);
		}
		int sum=0;
		for(Future<Integer> f:flist) {
			try {
				sum=sum+f.get();
			} catch (InterruptedException|ExecutionException e) {
				e.printStackTrace();
			} 
		}
		System.out.println("The sum : "+sum);
		try {
			es.awaitTermination(2000,TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("end of main");
	}

}
