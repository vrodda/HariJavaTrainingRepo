package static1;

public class EmpTest {

	public static void main(String[] args) {

		Employee e1 = new Employee("John", 25, 1000);

		e1.showEmp();
		
		e1.showCount(); 
		
		

		Employee e2 = new Employee("Miller", 20, 3000);
		
		e2.showEmp();
		
		e2.showCount();

		Employee e3 = new Employee("Smith", 30, 1500);
		
		e3.showEmp();
		
		e3.showCount();
	}
}
