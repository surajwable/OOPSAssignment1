class AddNumbersIntegerParse
{
public static void main(String[]args)
{
	if(args.length>0)
	{
		
int result=0;
for(int i=0;i<args.length;i++)
{
result=result+ Integer.parseInt(args[i]);
}
System.out.println("Answer "+result);
}
else
{
System.out.println("plz enter min 2 command line arguments");
}
}
}