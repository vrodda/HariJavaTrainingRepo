package oops;

public class AccountDetailsTest {

	public static void main(String[] args) {
		
		AccountDeatils obj = new AccountDeatils();
		
		String output1 = obj.getAcctDetails("Smith");
		
		String output2 = obj.getAcctDetails("John","1000");
		
		String output3 = obj.getAcctDetails("Miller","5000",1);
		
		System.out.println(output1);
		
		System.out.println(output2);
		
		System.out.println(output3);
	}
}
