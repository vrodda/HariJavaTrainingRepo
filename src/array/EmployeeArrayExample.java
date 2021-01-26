package array;

public class EmployeeArrayExample {

	public static void main(String[] args) {

	
		Employee e1 = new Employee();

		e1.empName = "Smith";
		e1.empSalary = 2000;
		e1.empAge = 25;

		Employee e2 = new Employee();

		e2.empName = "Brown";
		e2.empSalary = 1500;
		e2.empAge = 27;

		Employee e3 = new Employee();

		e3.empName = "Johnson";
		e3.empSalary = 2300;
		e3.empAge = 37;

		Employee e4 = new Employee();

		e4.empName = "Rama";
		e4.empSalary = 2800;
		e4.empAge = 45;
		
		
			
		Employee empArray[] = new Employee[4];


		empArray[0] = e1;
		empArray[1] = e2;
		empArray[2] = e3;
		empArray[3] = e4;
		
		
		for (Employee emp: empArray) {
			
			System.out.println(emp.empName);
			System.out.println(emp.empAge);
			System.out.println(emp.empSalary);
			
			System.out.println("----------");
		}
		
		
		for (int i = 0; i < empArray.length; i++) {
			
			System.out.println(empArray[i].empName);
			System.out.println(empArray[i].empAge);
			System.out.println(empArray[i].empSalary);
			
			System.out.println("----------");
			
		}
	
	}
}
