package cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class RetrievingDataWithListIterator1 {

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
						
			while (itr.hasPrevious()) {
				
				
				String s2 =(String) itr.previous();
				System.out.println(s2);
				if ("Amitab".equals(s2)) {
					break;
				}
			}
			
			break;
		}
		
		
	}
	
	
		
	
	}

}
