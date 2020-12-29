
public class Example18 {

	// type conversion or type casting
	
	public static void main(String[] args) {
		
		byte b  =127;		
		int temp =b; // implicit casting //type widening
		System.out.println(temp);
		
		int k =90;
		byte j =(byte)k; // explicit casting //type narrowing
		
		
		System.out.println(j);
		
		
	}
}
