class ConcatArray
{
public static void main(String[]args)
{
int arr [][]= {{1,2,3},{4,5,6}};
int brr[]=new int[6];
for(int i=0;i<arr.length;i++)
	{
	for(int j=0;j<arr[i].length;j++)
    {
	System.out.print("2D array: "+arr[i][j] +" \t");
	}
	System.out.println();
	}
}
}