
public class Test11 {

	public static void main(String[] args) {

		
		int x = 1;
		
		int y = 1 + x++;
		
		System.out.println("x ="+x+"y ="+y);
		
		 y = 1 + ++x;
		 
			System.out.println("x ="+x+"y ="+y);
			
			 y = 1 +x--;
			 
			 System.out.println("x ="+x+"y ="+y); 
			 
			 y = 1 + --x;

			 System.out.println("x ="+x+"y ="+y); 
	}
	
}
