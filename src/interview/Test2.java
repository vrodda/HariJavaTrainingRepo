package interview;

public class Test2 {

	public static void main(String[] args) {

		try {
			throw new Exception();
			
		} catch (Exception e) {
			System.out.println("Catch");
			
			System.exit(0);
		}

		finally {
			System.out.println("Finally");
		}
	}
}
