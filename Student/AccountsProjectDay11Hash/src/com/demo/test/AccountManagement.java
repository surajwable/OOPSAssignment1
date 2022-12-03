package com.demo.test;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Account;
import com.demo.service.AccountService;
import com.demo.service.AccountServiceImpl;

public class AccountManagement {

	public static void main(String[] args) {
		AccountService aservice=new AccountServiceImpl();
		Scanner sc=new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("**************MENU****************");
			System.out.println("2.show all Accounts\n3.Display first n Accounts sort by Salary\n4.Exit");
			System.out.println("Enter the choice");
			choice=sc.nextInt();

			switch(choice) {

			case 2://get all
				Set<Account>tset=aservice.getAll();
				tset.stream().forEach(x->System.out.println(x));
				break;

			case 3://display first n account
				System.out.println("enter n accounts");
				int n=sc.nextInt();
				List<Account>lst=aservice.getTopNAccounts(n);
				lst.stream().forEach(x->System.out.println(x));
				break;

			case 4:System.out.println("Thank you for Visiting....!!!");
			sc.close();
			break;
			}

		}while(choice!=3);
	}

}
