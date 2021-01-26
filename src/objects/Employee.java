package objects;

public class Employee {

	String empName;
	String empSal;
	int age;
	
	
	

	public Employee(String empName, String empSal, int age) {
						
		this.empName = empName;
		this.empSal = empSal;
		this.age = age;
	}
	
	
	public Employee() {
		
		
	}


	public void displayEmpDetails()
	{
		System.out.println("Emp Name is :"+empName +" EmpSal :"+empSal +" EmpAge "+age);
	}
	
}
