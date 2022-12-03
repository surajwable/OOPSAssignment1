package com.demo.test;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestEmployeeMgmt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService eservice=new EmployeeServiceImpl();
		int choice;
		do {
			System.out.println("1.Add new Employee\n2.Remove By Id\n 3.Remove By Name\n");
			System.out.println("4.Find By ID\n5.Find By Name\n6.Display All Employees\n");
			System.out.println("7.display all with salary > given salary\n8.Modify Salary\n9.Sort By Salary 10.exit\n ");
			System.out.println("choice :");
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1://add new Employee
				eservice.addEmployee();
				break;
				
			case 2://remove by id
				System.out.println("enter id");
				int id=sc.nextInt();
				eservice.removebyid(id);
				boolean status=eservice.removebyid(id);
				if(status) {
					System.out.println("removed successfully by id");
				}
				else {
					System.out.println("Not found");
				}
				break;
				
			case 3://remove by name
				System.out.println("enter name to delete");
				String name=sc.next();
				status=eservice.removebyname(name);
				if(status) {
					System.out.println("removed successfully by name");
				}
				else {
					System.out.println("Not Found");
				}
				break;
				
			case 4://find by Id
				System.out.println("enter id");
				id=sc.nextInt();
				eservice.findbyid(id);
				break;
				
			case 5://find by name
				System.out.println("enter Name");
				String name1=sc.next();
				List <Employee> li=eservice.findbyname(name1);
				if(li!=null) {
					li.stream().forEach(x->{System.out.println(x);});
				}
				else {
					System.out.println("not found");
				}
				break;
				
			case 6://display all
				Set<Employee> eset=eservice.displayAll();
				if(eset!=null) {
					eset.stream().forEach(x->{System.out.println(x);});
				}
				else {
					System.out.println("Not FOUND.....!!!");
				}
				break;
				
			case 7:{
				System.out.println("Enter Salary to search");
				double salary = sc.nextDouble();
				
				List<Employee> l1=eservice.findBySalary(salary);
				if(l1!=null) {
					l1.stream().forEach(x->{System.out.println(x);});
				}
				else
					System.out.println("Not found!!");
				break;
				
				
			}
				
			//modify salary
			case 8:{
				System.out.println("Enter id: ");
				id = sc.nextInt();
				System.out.println("Enter new Salary: ");
				double sal = sc.nextDouble();
				status= eservice.modifySalary(id,sal);
				if(status) {
					System.out.println("Modified successfully");
				}
				else {
					System.out.println("Not found.");
				}
				
				break;
			}
				
			case 9:{
				eset=eservice.sortBySalary();
				for(Employee e1: eset) {
					System.out.println(e1);
				}
				break;
			}
				
			case 10://exit
				System.out.println("Thank you for visiting..!!");
				sc.close();
				break;
			}
			
			
			
			
		}
		while(choice!=10);
		
	}

}
