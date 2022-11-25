package Student;
import java.util.Scanner;
public class TestStudent {
	public static void main(String[] args) {
	Student[] stud=new Student[5];
	Scanner sc=new Scanner(System.in);
	//StudentService.calPercentage(stud, 0, 0, 0);
	//Student a=StudentService.search(stud,1);
	//StudentService.display(a);
	
	int choice;
	do
	{
		System.out.println("**********************MENU**********************");
		System.out.println("1.ADD NEW STUDENT\n2.FIND PERCENTAGE AND GPA OF A STUDENT\n3.DISPLAY A STUDENT BY ID\n4.DISPLAY ALL STUDENTS");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			
			break;
			
		case 2:
			double percent=StudentService.calPercentage();
			System.out.println(percent);
			break;
			
		case 3:
			break;
			
		case 4:
			StudentService.acceptStudentData(stud);
			StudentService.display(stud);
			break;
			
		case 5:
			default:
		break;
		}
	}
			while(choice!=6);
	}

	}

