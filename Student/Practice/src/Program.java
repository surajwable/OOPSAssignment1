import java.util.Scanner;

public class Program {
static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		int arr[] = new int[4];/* {10,20,30,40,50}; */
		
		for(int element : arr) {
			element=5;	
		}
		for(int element : arr) {
			System.out.println(element);
		}
	
		
	}

}
