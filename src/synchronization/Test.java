package synchronization;

public class Test {

	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
		t1.start();
		
	
		
		Thread2 t2 = new Thread2();		
		t2.start();
		

		
	}
}
