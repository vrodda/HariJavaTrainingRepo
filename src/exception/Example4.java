package exception;

public class Example4 {

	
	public static void main(String[] args)  {
		
		System.out.println("Start");
		
		Example4 obj = new Example4();
		
		try {
			obj.m1();
		}
		catch (Exception e) {
			System.out.println("Some Exception Has Occuered");
		}
		
		
		System.out.println("End");
	}
	
	
	public void m1() throws Exception
	{
		throw new Exception();
	}
}
