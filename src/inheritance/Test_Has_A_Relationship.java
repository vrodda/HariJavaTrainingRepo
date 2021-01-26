package inheritance;

public class Test_Has_A_Relationship {

	public static void main(String[] args) {
		
		Account obj = new Account();
		
		System.out.println(obj.name);
		
		System.out.println(obj.balance);
		
		System.out.println(obj.addr.city);
		
		System.out.println(obj.addr.state);
	}
}
