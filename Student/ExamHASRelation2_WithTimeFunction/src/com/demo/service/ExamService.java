package com.demo.service;

import java.util.Scanner;

import com.demo.beans.Exam;
import com.demo.beans.Question;

public class ExamService {

	public static void list() {
		Scanner sc=new Scanner(System.in);
		//creating arrays for java and html questions with 5 questions each
		Question java[]=new Question[5];
		Question html[]=new Question[5];

		//List of JAVA Questions and its options
		java[0]=new Question(1,"When an array is passed to a method, what does the method receive?\n","OPTIONS\nReference of the aray\n","copy of the array\n","Length of array\n","copy of the first element\n");//option1
		java[1]=new Question(2,"What is the variables declared in a class for the use of all methods of the class called?\n","object\n","instance variable\n","Referernce variable\n","none\n");//instance variable option2
		java[2]=new Question(3,"What is the implicit return type of constructor?\n","no return type\n","a class object in which it is defined\n","void\n","none\n");//a class object in which it is defined op2
		java[3]=new Question(4,"When is the object created with new keyword?\n","at run time\n","at compile time\n","depends on the code\n","none\n");//at run time op1
		java[4]=new Question(5,"In which of the following is toString() method defined?\n","java.lang.object\n","java.lang.string\n","java.lang.util\n","none\n");//java.lang.object op1
		
		//List of HTML Questions and its Options
		html[0]=new Question(1,"How many sizes of headers are available in HTML by default?\n","5\n","1\n","3\n","6\n");//op4
		html[1]=new Question(2,"What does the abbreviation HTML stand for?\n","hypertext Markup language\n","hightext Markup Langauge\n","hightext Markdown Langauge\n","4.none\n");//op1
		html[2]=new Question(3,"What is the smallest header in HTML by default?\n","h1\n","h2\n","h6\n","h4\n");//h6 option 3
		html[3]=new Question(4,"HTML files are saved by default with the extension?\n",".html\n",".ht\n",".h\n","none\n");//op1
		html[4]=new Question(5,"We enclose HTML tags within?\n","{}"," <>\n"," !!\n","none\n");//op2

		int choice;
		do {
			System.out.println("****************All the best***********************");
			System.out.println("please select exam\n1.Core JAVA\n2.HTML");
			choice =sc.nextInt();
			switch(choice) {
			case 1:
				//declaring counter to count number of correct questions.
				int correctans=0;
				System.out.println("enter your id");
				int examid=sc.nextInt();
				System.out.println("Enter name");
				String name=sc.next();
				//creating an object for java exam
				Exam E=new Exam(examid,name,dt,java);
				System.out.println(E);
				System.out.println("read questions carefully and give answers accordingly");
				System.out.println("Enter answer for Question 1 "+":-plase type correct option number");
				int ans1=sc.nextInt();
				if(ans1==1) {
					correctans++;
				}
				System.out.println("Enter answer for Question 2 "+":-plase type correct option number");
				int ans2=sc.nextInt();
				if(ans2==2) {
					correctans++;
				}
				System.out.println("Enter answer for Question 3 "+":-plase type correct option number");
				int ans3=sc.nextInt();
				if(ans3==2) {
					correctans++;
				}
				System.out.println("Enter answer for Question 4 "+":-plase type correct option number");
				int ans4=sc.nextInt();
				if(ans4==1) {
					correctans++;
				}
				System.out.println("Enter answer for Question 5 "+":-plase type correct option number");
				int ans5=sc.nextInt();
				if(ans5==1) {
					correctans++;
				}
				if(correctans>3) {
					System.out.println("Congratulations....!!!!You have Successfully passed the JAVA test");
					System.out.println("your score is"+correctans);
				}
				else {
					System.out.println("Sorry ,Better luck next time ");
				}
				break;
				
			case 2:
				//declaring counter to count number of correct questions.
				int correcthtml=0;
				System.out.println("enter your id");
				int examid1=sc.nextInt();
				System.out.println("Enter name");
				String name1=sc.next();
				//creating an object for html exam
				Exam E1=new Exam(examid1,name1,dt,html);
				System.out.println(E1);
				System.out.println("read questions carefully and give answers accordingly");
				System.out.println("Enter answer for Question 1 "+":-plase type correct option number");
				int ans11=sc.nextInt();
				if(ans11==4) {
					correcthtml++;
				}
				System.out.println("Enter answer for Question 2 "+":-plase type correct option number");
				int ans22=sc.nextInt();
				if(ans22==1) {
					correcthtml++;
				}
				System.out.println("Enter answer for Question 3 "+":-plase type correct option number");
				int ans33=sc.nextInt();
				if(ans33==3) {
					correcthtml++;
				}
				System.out.println("Enter answer for Question 4 "+":-plase type correct option number");
				int ans44=sc.nextInt();
				if(ans44==1) {
					correcthtml++;
				}
				System.out.println("Enter answer for Question 5 "+":-plase type correct option number");
				int ans55=sc.nextInt();
				if(ans55==2) {
					correcthtml++;
				}
				if(correcthtml>3) {
					System.out.println("Congratulations....!!!!You have Successfully passed the HTML test");
					System.out.println("your score is"+correcthtml);
				}
				else {
					System.out.println("Sorry ,Better luck next time ");
				}
				break;
				
			case 3:default:System.out.println("Want to attemp next time");
			sc.close();
			break;
				

			}
		}while(choice!=6);
	}
}
