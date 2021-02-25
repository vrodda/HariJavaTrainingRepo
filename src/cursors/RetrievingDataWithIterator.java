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
		
		System.out.println(l);
		
		while (itr.hasNext()) {
			String temp = (String) itr.next();
			if("Ajay".equals(temp)) {
				itr.remove();
			}
			System.out.println(temp);		
		}
		
		System.out.println(l);
		
	}

}
