package objects;

public class EmpTest {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		Employee e1 = new Employee("John", "1000", 25);
		
		e1.displayEmpDetails();
		
		Employee e2 = new Employee("Smith", "2000", 21);
		
		e2.displayEmpDetails();
		
		Employee e3 = new Employee("Miller", "5600", 29);
		
		e3.displayEmpDetails();
		
	}
}
