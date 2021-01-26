
public class Test15 {

	public static void main(String[] args) {
		
		int a= 10;
		
		long b =a; // trying to keep int value into long--> implicitly converted
		
		System.out.println(b);
		
		
		
	   long c= 10;
	 	
		int d =(int)c; // we are telling the compiler to convert long to int--> explicitly converted
		
		System.out.println(d);
	}
}
