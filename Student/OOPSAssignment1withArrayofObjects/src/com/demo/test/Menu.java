package com.demo.test;

import java.util.Scanner;

import com.demo.beans.MscStudent;
import com.demo.service.StudentServices;

public class Menu {
	static int choice;
	static Scanner sc=new Scanner(System.in);
	public static void menudriven() {
		
		do {
			System.out.println("enter the choice");
			System.out.println("1.MscStudent\n 2.PhdStudent");
			choice=sc.nextInt();
			switch(choice) {
			
			case 1:
				MscStudent[]m=new MscStudent[3];
				int choice1;
				
				do {
					System.out.println("Welcome to Msc Students Portal");
					System.out.println("1.New Student Admission\n 2.search Student \n 3.Display all Students in Msc");
					System.out.println("Enter the choice");
					choice1=sc.nextInt();
					switch(choice1) {
				case 1:
					StudentServices.addMscData(m);
					System.out.println("Congratulations......!!!!!\nAdmission is Conformed");
					break;
					
				case 2:
					StudentServices.searchMsc(m, choice1);
					System.out.println("enter the id of student to search");
					int choice1=sc.nextInt();
					
				}
				}
			}
			
		}
	}
}
