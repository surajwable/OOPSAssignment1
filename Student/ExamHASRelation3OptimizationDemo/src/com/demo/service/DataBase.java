package com.demo.service;

import com.demo.beans.Question;

public class DataBase {
	
	private static Question java[]=new Question[5];
	private static Question html[]=new Question[5];
	private static Answer javaA[]=new Answer[5];
	private static Answer javaB[]=new Answer[5];
	
	static {
		java[0]=new Question(1,"When an array is passed to a method, what does the method receive?\n","Reference of the aray\n","copy of the array\n","Length of array\n","copy of the first element\n");//option1
		java[1]=new Question(2,"What is the variables declared in a class for the use of all methods of the class called?\n","object\n","instance variable\n","Referernce variable\n","none\n");//instance variable option2
		java[2]=new Question(3,"What is the implicit return type of constructor?\n","no return type\n","a class object in which it is defined\n","void\n","none\n");//a class object in which it is defined op2
		java[3]=new Question(4,"When is the object created with new keyword?\n","at run time\n","at compile time\n","depends on the code\n","none\n");//at run time op1
		java[4]=new Question(5,"In which of the following is toString() method defined?\n","java.lang.object\n","java.lang.string\n","java.lang.util\n","none\n");//java.lang.object op1
	
		html[0]=new Question(1,"How many sizes of headers are available in HTML by default?\n","5\n","1\n","3\n","6\n");//op4
		html[1]=new Question(2,"What does the abbreviation HTML stand for?\n","hypertext Markup language\n","hightext Markup Langauge\n","hightext Markdown Langauge\n","4.none\n");//op1
		html[2]=new Question(3,"What is the smallest header in HTML by default?\n","h1\n","h2\n","h6\n","h4\n");//h6 option 3
		html[3]=new Question(4,"HTML files are saved by default with the extension?\n",".html\n",".ht\n",".h\n","none\n");//op1
		html[4]=new Question(5,"We enclose HTML tags within?\n","{}"," <>\n"," !!\n","none\n");//op2
	}
	
	public static boolean withdrawAmt(int accno, int pin, float amt) {
		// TODO Auto-generated method stub
		
		Account ac=searchAcc(accno);
		if(ac!=null)
		{
			if(ac.getPin()==pin)
			{
				ac.withdraw(amt);
				return true;
			}
			}
		return false;
	}
	
	public static DataBase searchAcc(int accno)
	{
		for(int i=0;i<count;i++)
		{
			if(accno==acarr[i].getId())
			{
				return acarr[i];
			}
			
		}
		return null;
		}
	

}
