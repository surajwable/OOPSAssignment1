package com.demo.test;

import java.util.Scanner;

import com.demo.exception.WrongNumberException;

public class TryBlockforGuessingGame {

	public static void main(String[] args) {

		int i=50;
		
		int level=0;
		int count=0;
		Scanner sc=new Scanner(System.in);
		while(true) {
		try
		{
			System.out.println("Guess the number...!! ");
			int input=sc.nextInt();
			count++;
			if(input==i) {
				System.out.println("Hurray...You have won the Game...!!!");
			}
			else 
			{
				throw new WrongNumberException("oops..You Have lost the attempt Number"+count) ;
			}
			sc.close();
			break;
			
		}catch(WrongNumberException e){
			System.out.println(e.getMessage());
		}
		}
		level++;
		System.out.println("Challange Accoumplished....!!! Level up to"+" "+level);
	}

}
