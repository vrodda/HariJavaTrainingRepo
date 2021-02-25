package listSample;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class ArrayListSample2 {

	public static void main(String[] args) {
		
		ArrayList obj = new ArrayList();
		
		LinkedList obj1= new LinkedList<>();
		
		obj.add("Vijay");
		obj.add("Hari");
		obj.add(new Date());
		obj.add(10);
		obj.add(20);
		obj.add("Vijay");
		
		int i =10;
		Integer j = new Integer(20);
		String name="John";
		
		for (Object object : obj) {
			System.out.println(object);
		}
		
		
	}
}
