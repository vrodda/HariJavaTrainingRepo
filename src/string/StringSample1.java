package string;

public class StringSample1 {

	public static void main(String[] args) {
		
		
		String s1 = new String("Vijay");
		String s2 = new String("Vijay"); // heap
		
		System.out.println(s1==s2); // compares reference 
		System.out.println(s1.equals(s2)); // compares content
	}
}
