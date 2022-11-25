class Addition{
public static void main(String [] args)
{
	if(args.length>0)
	{
	result=0
	for(int i=0;i<args.length;i++)
	{
		result=result+args[i];
	}
	System.out.println("Answer:: "+result);
	}
	else
	{
	System.out.println("please enter two arguments");
	}
}
}