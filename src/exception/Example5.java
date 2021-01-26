package exception;

public class Example5 {

	
	public static void main(String[] args)  {
		
		System.out.println("Start");
		
		Example5 obj = new Example5();
		
		try {
			obj.m1();
		}
		
		
		catch(ArithmeticException e)
		{
			System.out.println("Arithmatic Exception Occured");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds Exception  Occured");
		}
		
		catch (Exception e) {
			System.out.println("Some Exception Has Occuered");
		}
		
		
		System.out.println("End");
	}
	
	
	public void m1() throws Exception
	{
		
		int c = 4/8;
		
		int a[] = {10,20};
		
		System.out.println(a[2]);
		
		throw new Exception();
	}
}
