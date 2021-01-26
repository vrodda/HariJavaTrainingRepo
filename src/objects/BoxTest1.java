package objects;

public class BoxTest1 {

	public static void main(String[] args) {

	
		Box obj = new Box(2,3,5);
		
		System.out.println(obj.length);
		System.out.println(obj.breadth);
		System.out.println(obj.height);
		
		double v = obj.volume();
		
		
		
		
		System.out.println(v);
		
	}
}
