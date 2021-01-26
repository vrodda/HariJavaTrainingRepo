package exception;

public class InsuffientFundsException extends Exception {

	public InsuffientFundsException() {

		System.out.println("You dont have sufficient balance to draw");
	}

}
