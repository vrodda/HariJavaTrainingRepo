package listSample;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class LinkedListSample1 {

	public static void main(String[] args) {

		LinkedList obj = new LinkedList<>();
		obj.add("Vijay");
		obj.add("Hari");
		obj.add(new Date());
		obj.add(10);
		obj.add(20);
		obj.add("Vijay");
		obj.add(20);
		obj.add("Vijay");
		obj.add(1,"Hari Kumar");

		System.out.println(obj);

	}
}
