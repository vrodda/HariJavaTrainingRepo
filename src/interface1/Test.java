package interface1;

public class Test {

	public static void main(String[] args) {
		
		HSBCBanK obj = new Sample(); // created reference of the Interface
		
		obj.deposit();
		
		System.out.println(HSBCBanK.a);
		//HSBCBanK obj1 = new HSBCBanK(); // trying to create object of interface. WHICH IS NOT ALLOWED.
		
		
	}
}
