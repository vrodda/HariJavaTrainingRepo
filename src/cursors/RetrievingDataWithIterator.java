package cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class RetrievingDataWithIterator {

	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();

		l.add("Amitab");

		l.add("Ajay");

		l.add("Sharukh");

		l.add("Salman");
	
		Iterator itr = l.iterator();
		
		while (itr.hasNext()) {
			
			String s1 = (String) itr.next();
			
			if ("Ajay".equals(s1)) {
				itr.remove();
			}
			
			
		}
System.out.println(l);
		
	}

}
