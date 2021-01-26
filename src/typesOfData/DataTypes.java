package typesOfData;

public class DataTypes {

	public static void main(String[] args) {
		
		int a=10; // Primitive data type
		
		Integer b = new Integer(20); //  reference types/Wrapper type
		
		
		
		Integer c = a;// Putting a primitive type into wrapper type AUTOBOXING.
		
		System.out.println(c);
		
		
		int d = b;// Putting a wrapper  type into primitive type AUTO UNBOXING.
		
		System.out.println(d);
		
	}
}
