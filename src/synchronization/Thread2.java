package synchronization;

public class Thread2 extends Thread {

	CriticalSection c2 = new CriticalSection();
	
	public void run()
	{
		for (int i = 0; i < 10; i++) {
			c2.hello();
			c2.hi();
			System.out.println("Second");
		}
		
	}
}
