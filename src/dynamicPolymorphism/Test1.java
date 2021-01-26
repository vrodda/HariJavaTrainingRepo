package dynamicPolymorphism;

public class Test1 {

	public static void main(String[] args) {
		
		Base b = new Base();
		
		b.m1();
	//	b.m2();
		
		Derived d = new Derived();
		
		d.m1();
		d.m2();
		
	}
}
