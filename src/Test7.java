
public class Test7 {

	public static void main(String[] args) {
		
		final int a =10;		
		 int b = 20;		 
		 
		 System.out.println(a);
		 System.out.println(b);
		 
		 
	//    a= 15; This wont work because variable 'a' is declared as final(constant)
		b=25;
		
		 System.out.println(a);
		 System.out.println(b);
	}
}
