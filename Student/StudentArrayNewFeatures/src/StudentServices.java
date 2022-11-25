import java.util.Scanner;

public class StudentServices {
	static int count=0;
	static Scanner sc=new Scanner(System.in);
	
	public static void acceptStudentData(Student[]stud)
	{
		int i;
		for(i=count;i<stud.length;)
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
			count++;
			break;
		}
	}

	public static void display(Student[]stud) 
	{
		for(int i=0;i<stud.length;i++) {
			System.out.println(stud[i]);
		}
	}

	public static void search(Student[]stud,int id) 
	{   
		int flag=0;
		for(int i=0;i<count;i++)
		{
			if(stud[i].getId()==id)
			{
				System.out.println("Student Found\n"+stud[i]);
				flag=1;
				break;
			}
		} 
		if(flag==0)
		{
		System.out.println("Student Not Found");
		}
	}

	public static int calPercentage(Student[]stud,int id)
	{
		int per=1;
		
		for(int i=0;i<count;i++) 
		{

			if(stud[i].getId()==id)
			 {
			
				per=(stud[i].getM1()+stud[i].getM2()+stud[i].getM3())/3;
			
				break;
			}
			
		}
		return per;
	}

	public static void GPA(int per) {
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
