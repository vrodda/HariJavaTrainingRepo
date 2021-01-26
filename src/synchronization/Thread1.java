package synchronization;

public class Thread1 extends Thread {

	CriticalSection c1 = new CriticalSection();
	
	public void run()
	{
		for (int i = 0; i < 10; i++) {
			
			c1.hello();	
			c1.hi();
			System.out.println("First");
		}		
	}
}
