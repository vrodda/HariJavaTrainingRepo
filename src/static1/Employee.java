package static1;

public class Employee {

	String eName; // instance variables or non-static variables
	int age; // instance variables or non-static variables
	double salary;// instance variables or non-static variables
	
	static int count; // static variable
	
	public Employee(String eName, int age, double salary) {
		
		this.eName = eName;
		this.age = age;
		this.salary = salary;
		
		count++;
	}
	
	
	public void showEmp() // instance method or non static
	{
		System.out.println(eName +"  "+age+"  "+salary+"   "+count);// Both static n non static variables are allowed inside non static method
	}
	
	
	public static void showCount()
	{
	//	System.out.println(eName +"  "+age+"  "+salary); Instance(Non Static variables) are not allowed inside static method
		System.out.println("emp count is "+count);
	}
	
	
	
}
