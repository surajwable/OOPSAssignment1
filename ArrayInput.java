import java.util.Scanner;
class ArrayInput
{
public static void main(String[]args)
{
int arr[]=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("Enter the array elements");
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}

for(int i=0;i<arr.length;i++)
{
	//System.out.println("the Array given by user is :"+arr[i]+"\n");
	//System.out.println("the Array given by user is :");
	System.out.println(arr[i]);
}
}
}


