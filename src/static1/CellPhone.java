package static1;

public class CellPhone {

	int makeYear;
	
	static String companyName;
	
	// instance block. It will be called as per number of objects created
	{
		System.out.println("Inside Instance block");
		makeYear=2015;
	}
	
	//static block
	
	static
	{
		 companyName="Samsung";
		System.out.println("Inside  Static Block");
	}
	
	public CellPhone() {
		System.out.println("This is A Constructor");
	}
}
