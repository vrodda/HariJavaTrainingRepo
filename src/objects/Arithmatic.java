package objects;

public class Arithmatic {

	
	int firstValue;
	
	int secondValue;
	
	int thirdValue;
	
	

	public Arithmatic() {
		
		System.out.println("Zero parameter Constructor/ Default Constructor");
	}

	public Arithmatic(int firstValue) {
		
		this.firstValue = firstValue;
		
		System.out.println("One parameter Constructor "+firstValue);
	}

	public Arithmatic(int firstValue, int secondValue) {
		
		this.firstValue = firstValue;
		this.secondValue = secondValue;
		

		System.out.println("Two parameter Constructor "+firstValue +"  "+secondValue);
	}

	public Arithmatic(int firstValue, int secondValue, int thirdValue) {
		
		this.firstValue = firstValue;
		this.secondValue = secondValue;
		this.thirdValue = thirdValue;
		
		System.out.println("Three parameter Constructor "+firstValue +"  "+secondValue+ "  "+thirdValue);
	}
	
	
	
	
	
}
