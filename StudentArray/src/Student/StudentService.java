package Student;

import java.util.Scanner;

public class StudentService {
	
	public static void acceptStudentData(Student[]stud)
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<stud.length;i++)
		{
			System.out.println("enter ID");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter name");
			String name=sc.nextLine();
			System.out.println("enter M1");
			int m1=sc.nextInt();
			System.out.println("enter M2");
			int m2=sc.nextInt();
			System.out.println("enter M3");
			int m3=sc.nextInt();
			
			stud[i]=new Student(id,name,m1,m2,m3);
			break;
		}
		count++;
	}
	
	public static void display(Student[]stud) {
		for(int i=0;i<stud.length;i++) {
			System.out.println(stud[i]);
		}
	}
	
	public static Student search(Student[]stud,int id) {
		for(int i=0;i<stud.length;i++) {
			if(stud[i].getId()==id) {
				System.out.println("Student Found\n"+stud[i]);
				break;
			}
		}
		System.out.println("Student Not Found");
	}
	
	public static double calPercentage(Student[]stud,int id) {
		double per=0;
		if(stud[i].getId==id) {
			
		
		for(int i=0;i<stud.length;i++) {
			int total=0;
			total=stud[i].getM1()+stud[i].getM2()+stud[i].getM3();
			per=(total/300)*100;
			
		}
		return per;
	}
	return 0;
	}
	
	public static void GPA(double per) {
		if(per>80) {
			System.out.println("GRADE A");
		}
		else if(per<80 && per>70) {
			System.out.println("GRADE B");
		}
		else if(per<70 && per>60) {
			System.out.println("GRADE C");
		}
		else {
			System.out.println("GRADE D");
		}
	}
	
	

}
