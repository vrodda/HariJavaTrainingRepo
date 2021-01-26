package array;

public class EmployeeTest {

	public static void main(String[] args) {
		
		
		Employee emp1 = new Employee();
		
		emp1.empName ="Smith";
		emp1.empSalary =2000;
		emp1.empAge=25;
		
		System.out.print(emp1.empName+"    ");
		System.out.print(emp1.empSalary+"    ");
		System.out.print(emp1.empAge);
		
		System.out.println();
		System.out.println("---------------");
		
		
		
       Employee emp2 = new Employee();
		
       emp2.empName ="Russel";
       emp2.empSalary =3000;
       emp2.empAge=29;
		
		System.out.print(emp2.empName+"    ");
		System.out.print(emp2.empSalary+"    ");
		System.out.print(emp2.empAge);
	}

}
