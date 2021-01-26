package exception;

public class Example7 {

	
	public static void main(String[] args)  {
		
		System.out.println("Start");
		
		Example7 obj = new Example7();
		
		try {
			obj.m1();
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds Exception  Occured");
		}
		finally
		{
			System.out.println("Finally block is called");
		}
		
		
		System.out.println("End");
	}
	
	
	public void m1() 
	{
		
		int c = 4/8;
		
		int a[] = {10,20};
		
		System.out.println(a[1]);
		
		
	}
}
