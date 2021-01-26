package objects;

public class BoxTest {

	public static void main(String[] args) {

		Box a = new Box();// declaring object and creating object.
		
		Box b;// Only REFERENCE created...declaring object. The initial value is NULL
		b = new Box();//creating object.The object is created.
		
		
		System.out.println(a.length);
		System.out.println(a.breadth);
		System.out.println(a.height);
		
		System.out.println(b.length);
		System.out.println(b.breadth);
		System.out.println(b.height);
		
		double vol =a.volume();
		System.out.println(vol);
	}
}
