package collections_map;

public class EqualsMethodExample {

	public static void main(String[] args) {
		
		String s1 = "John";
		
		String s2 = "John";
		
		String s3 = new String("John");
		
		System.out.println(s1.hashCode());
		
		 s1 = s1+"Smith";
		
		
		System.out.println(s2.hashCode());
		System.out.println(s1.hashCode());
		
		System.out.println(s1==s2); // TRUE because of String POOL
		
		System.out.println(s1==s3);// FALSE because of both are different objects
		
		System.out.println(s1.equals(s3));
		
		
	}
}
