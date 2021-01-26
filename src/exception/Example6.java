package exception;

public class Example6 {

	
	public static void main(String[] args)  {
		
		System.out.println("Start");
		
		Example6 obj = new Example6();
		
		try {
			obj.m1();
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
		
		System.out.println(a[2]);
		
		
	}
}
