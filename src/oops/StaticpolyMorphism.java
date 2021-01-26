package oops;

public class StaticpolyMorphism {

	public static void main(String[] args) {
		
		Arithmatic obj = new Arithmatic();
		
		int output = obj.add(10,20,30,40);
		
		// Which method to call ? this decision is taken at compile time.
		
		System.out.println(output);
	}
}
