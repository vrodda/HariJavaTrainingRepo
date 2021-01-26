package pack1;

public class OneTest {

	public static void main(String[] args) {
		
		One obj = new One();
		
		//System.out.println(obj.a);
		
		//obj.m1();
		
		// any variable or method declared as private can be accessed in the same class.
		// It is not visible in the other classes
		
		
		System.out.println(obj.b);
		
		System.out.println(obj.c);
		
		System.out.println(obj.d);
		
		obj.m2();
		obj.m3();
		obj.m4();
	}
}
