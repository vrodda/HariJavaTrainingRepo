package dynamicPolymorphism;

public class Test3 {

	public static void main(String[] args) {
		
		Base b = new Derived();  // b is Base class reference , it is Derived class object
		
		b.m3(); // At compile time it will refer Base class m3 method. Then only it will compile
		// Run time it will pick from the Derived class
		

	}
}
