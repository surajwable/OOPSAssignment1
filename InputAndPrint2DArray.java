import java.util.Scanner;
class InputAndPrint2DArray
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("input the 2Darray matrix as per user choice");
int i=sc.nextInt();
int j=sc.nextInt();
int arr[][]=new int[i][j];
System.out.println("enter elements of 2D array");

for(i=0;i<arr.length;i++)
{
for(j=0;j<arr.length;j++)
{
arr[i][j]=sc.nextInt();
}
}
System.out.println("2D array is: ");
for(i=0;i<arr.length;i++)
{
for(j=0;j<arr[i].length;j++)
{
System.out.print(arr[i][j]+" ");
}
System.out.println();
}
int k=arr[i]+arr[j];
System.out.println("the Addition of 2D array is :"+k);
}
}