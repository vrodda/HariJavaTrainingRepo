package threads;

public class MyRunnable implements Runnable {

	public void run() {

		for (int i = 0; i < 10; i++) {

			System.out.println("Hi John " + i);
			
			try {
				Thread.sleep(2000);
			} 
			catch (InterruptedException e) {
				
			}
		}

	}

}
