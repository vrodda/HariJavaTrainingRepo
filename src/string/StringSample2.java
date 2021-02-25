package string;

public class StringSample2 {

	public static void main(String[] args) {
		
		
		String s1 = "Vijay"; // string pool
		String s2 = "Vijay";
		
		System.out.println(s1==s2); // compares reference 
		System.out.println(s1.equals(s2)); // compares content
	}
}
