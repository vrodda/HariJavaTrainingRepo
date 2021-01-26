package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample1 {

	public static void main(String[] args) {
		
		List l1 = new ArrayList(); // Duplicates allowed and insertion order preserved
		
		l1.add(10);
		l1.add(10);
		l1.add(10);
		l1.add(20);		
		l1.add(30);
		l1.add("John");		
		l1.add("Abc");
		l1.add("Abc");
		
		System.out.println(l1);
	}
}
