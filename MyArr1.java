public class MyArr1
{

	public static void main(String args[])
	{

		int arr[][]=new int[2][ ];

		arr[0]=new int[2];

		arr[1]=new int[2];

		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=count++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println(""+arr[i][j]);
			}
		}

	}
}