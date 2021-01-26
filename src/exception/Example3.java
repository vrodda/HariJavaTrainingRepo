package exception;

public class Example3 {

	
	public static void main(String[] args) throws Exception {
		
		System.out.println("Start");
		
		Example3 obj = new Example3();
		
		obj.m1();
		
		
		System.out.println("End");
	}
	
	
	public void m1() throws Exception
	{
		throw new Exception();
	}
}
