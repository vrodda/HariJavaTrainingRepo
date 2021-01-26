package inheritance;

public class Test_IS_A_Relationship {

	public static void main(String[] args) {
		
		SavingAccouont obj = new SavingAccouont();
		
		System.out.println(obj.name);
		
		System.out.println(obj.balance);
		
		System.out.println(obj.savinfInterest);
		
		

		CurrentAccouont obj1 = new CurrentAccouont();
		
		System.out.println(obj1.name);
		
		System.out.println(obj1.balance);
		
		System.out.println(obj1.currentfInterest);
	}
}
