package abstact1;

public class Test {

	public static void main(String[] args) {
		
	//	A obj = new A(); // A is abstract. you can not create object of abstract class. Abstract class can have reference.
		
		A obj = new B(); // Base class ref... Derived class object
		
		obj.m1();
		obj.m2();
	}
}
