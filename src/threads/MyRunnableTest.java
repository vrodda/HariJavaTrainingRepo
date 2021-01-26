package threads;

public class MyRunnableTest {

	public static void main(String[] args) {
		
		MyRunnable myRunnable = new MyRunnable();
		
		Thread t1 = new Thread(myRunnable,"First Thread");
		
		t1.setName("First Thread");
		
		t1.start();
	}
}
