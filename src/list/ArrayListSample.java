package list;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

public class ArrayListSample {

	public static void main(String[] args) {
		
		ArrayList l1 = new ArrayList(); // default constructor
			
		ArrayList l2 = new ArrayList(20); // constructor with initial capacity
		
		ArrayList l3= new ArrayList(l2); //  constructor with any collection
		
		
		System.out.println(l1 instanceof  Serializable);
		
		System.out.println(l1 instanceof  Cloneable);
		
		System.out.println(l1 instanceof  RandomAccess); 

	}
}


