package cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class RetrievingDataWithListIterator {

	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();

		l.add("Amitab");

		l.add("Ajay");

		l.add("Sharukh");

		l.add("Salman");
	
	ListIterator itr =	l.listIterator();
	
	while (itr.hasNext()) {
		
		String s1 = (String) itr.next();
		
		if ("Ajay".equals(s1)) {
			itr.remove();
			itr.add("Vijay");
			
			
		}
		
		
	}
	
	System.out.println(l);
		
	}

}
