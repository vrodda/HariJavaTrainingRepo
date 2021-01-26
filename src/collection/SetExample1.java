package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class SetExample1 {

	
	public static void main(String[] args) {
		
		HashSet l = new HashSet();
		
		
		l.add(20);
		
		l.add("John");
		
		l.add("John");
		
		l.add("Smith");
		
		l.add(null);
		
		l.add(10);
		
		System.out.println(l);
	}
}
