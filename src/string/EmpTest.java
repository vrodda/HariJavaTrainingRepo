package string;

public class EmpTest {

	public static void main(String[] args) {
		
		Emp emp1 = new Emp("101", "Vijay");
		Emp emp2 = new Emp("101", "Vijay");
		
		System.out.println(emp1==emp2); // compares reference... false
		System.out.println(emp1.equals(emp2));// compares content ... true
		
	}
}
