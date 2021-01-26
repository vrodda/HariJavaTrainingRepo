
public class Test14 {

	public static void main(String[] args) {
		
		int a =50;
		int b = 30;
		
		if(a>10 && b>20)// only first condition, if require it goes to second one
		{
			
			System.out.println("&& --> a is grater than 10 and b is grater than 20 ");
		}
		
		
		if(a>10 & b>20)// checks both condition, if require it goes to second one
		{
			
			System.out.println("&--> a is grater than 10 and b is grater than 20 ");
		}
		
		
		if(a>10 || b>20)// only first condition, if require it goes to second one
		{
			
			System.out.println("&& --> a is grater than 10 and b is grater than 20 ");
		}
		
		
		if(a>10 | b>20)// checks both condition, if require it goes to second one
		{
			
			System.out.println("&--> a is grater than 10 and b is grater than 20 ");
		}
		
	}
}
