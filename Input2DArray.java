import java.util.Scanner;
class Input2DArray
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int arr[][]=new int[3][3];
System.out.println("input values for 2D arrys");
for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr[i].length;j++)
{
arr[i][j]=sc.nextInt();
}
}
System.out.println("the 2D array taken from an user:");
for(int i=0;i<arr.length;i++)
{
	for(int j=0;j<arr[i].length;j++)
	{
	 System.out.print(arr[i][j]+ " ");
	}
	System.out.println();
}
}
}

