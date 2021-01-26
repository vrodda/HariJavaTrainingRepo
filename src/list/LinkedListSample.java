package list;

import java.util.LinkedList;

public class LinkedListSample {

	public static void main(String[] args) {	
		
		LinkedList l1 = new LinkedList();
		//LinkedList l2 = new LinkedList(Collection c);
		l1.add("Amitab");
		l1.add(30);
		l1.add(null);
		l1.add("Amitab");		
		System.out.println(l1);		
		
		l1.set(0,"Sharukh");		
		System.out.println(l1);		
		l1.add(0,"Salman");		
		System.out.println(l1);		
		l1.removeLast();		
		System.out.println(l1);		
		l1.addFirst("Ameer");		
		System.out.println(l1);
		
	}

}
