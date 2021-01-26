package dynamicPolymorphism;

public class Derived extends Base {

	int age = 20;
	public void m2()
	
	{
		
		System.out.println("m2 method from Derived class");
	}
	
	
	public void m3()
	{
		super.m3();
		System.out.println("m3 method from Derived class"+age);
	
		System.out.println(super.age);
	}
}
