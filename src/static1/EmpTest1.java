package static1;

public class EmpTest1 {

	public static void main(String[] args) {

		Employee e1 = new Employee("John", 25, 1000);

		e1.showEmp();
		
		System.out.println(e1.count); // static variable can be accessed with object
		System.out.println(e1.eName);// non static variable can be accessed with object
		
		

		Employee e2 = new Employee("Miller", 20, 3000);
		
		e2.showEmp();
		
		System.out.println(Employee.count);// static variable can be accessed with Class Name
		//System.out.println(Employee.eName);// non static variable can not be accessed with Class Name

		Employee e3 = new Employee("Smith", 30, 1500);
		
		e3.showEmp();
		
		System.out.println(Employee.count);
		
		
	}
}
