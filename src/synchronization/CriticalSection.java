package synchronization;

public class CriticalSection {

	public synchronized void  hello()
	{
		System.out.println("Hello.....");
	}
	
	public  void  hi()
	{
		System.out.println("1111");
		
		synchronized(this){
		System.out.println("2222");
		System.out.println("3333");
		}
		
		System.out.println("4444");
		System.out.println("5555");
		
	}

	
}
