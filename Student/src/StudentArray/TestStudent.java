package StudentArray;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		Student[] stud=new Student[3];
		Scanner sc=new Scanner(System.in);
	StudentService.acceptStudentData(stud);
	StudentService.display(stud);
	}

}
