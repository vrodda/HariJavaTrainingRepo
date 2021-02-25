package listSample;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArrayListSample1 {

	public static void main(String[] args) {
		
	//	ArrayList obj = new ArrayList();
		List obj = new ArrayList();
		obj.add("Vijay");
		obj.add("Hari");
		obj.add(new Date());
		obj.add(10);
		obj.add(20);
		obj.add("Vijay");
		obj.add(20);
		obj.add("Vijay");
		
		System.out.println(obj);
		
		
	}
}
