package listSample;

import java.util.Vector;

public class VectorSample {

	public static void main(String[] args) {

		Vector v1 = new Vector();

		System.out.println(v1.capacity());
		
		for (int i = 1; i <= 20; i++) {
			v1.addElement(i);
		}
		
		System.out.println(v1.capacity());		
		v1.add("Akshay");
		
		System.out.println(v1.capacity());
		
		System.out.println(v1);

		
		
	}
}
