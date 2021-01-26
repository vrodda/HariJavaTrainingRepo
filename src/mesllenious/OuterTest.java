package mesllenious;


public class OuterTest {

	public static void main(String[] args) {
		
		Outer o1 = new Outer();
		o1.m1();
		
		Outer.Inner i1 = o1.new Inner();
		
		i1.m2();
	}
}

