package exception;

public class Example9 {

	public static void main(String[] args) throws InsuffientFundsException {
		
		int balance =1000;
		
		int withdrawAmt =1100;
		
		if (withdrawAmt<balance) {
			
			System.out.println("You can with draw");
		}
		
		else
		{
			throw new InsuffientFundsException();
		}
	}
}
