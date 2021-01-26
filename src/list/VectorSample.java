package list;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorSample {
	
public static void main(String[] args) {
	
	Vector v1 = new Vector();
	
	List l1 = new ArrayList(); 
	
//	Vector v1 = new Vector();
//	Vector v2 = new Vector(Collection c);
//	Vector v3 = new Vector(int initialCapacity);
//	Vector v4 = new Vector(int initialCapacity,int increment);

	
	System.out.println(v1.capacity());	
	
	for (int i = 1; i <= 10; i++) {
		v1.addElement(i);
	}
	
	System.out.println(v1);
	
	System.out.println(v1.capacity());
	
	v1.addElement("Akshay");
	
	System.out.println(v1);
	
	System.out.println(v1.capacity());
	

}
}
