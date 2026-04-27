package exemptionhandling;



public class TrycatchBlock {
	public static void main (String[] args)
	{
		
	
	int a =12;
	int b = 0;
	try
	{
	int c = a/b;
	System.out.println("the answer is : "  + c);
	}
	
	catch(Exception e)
	{
		System.out.println("wrong input");
		System.out.println("The type of exception is : " + e);
	}
	
	}
}
	



