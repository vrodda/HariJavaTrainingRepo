package threads;

public class MyThreadTest {

	public static void main(String[] args) {
		  
		MyThread t1 = new MyThread();
		
		MyThread t2 = new MyThread();
		
		t1.start();
		
		System.out.println(t1.getPriority());
		
		System.out.println(Thread.MIN_PRIORITY);
		
		System.out.println(Thread.MAX_PRIORITY);
		
		t1.setPriority(8);
		
		t2.setPriority(6);
	}
}
