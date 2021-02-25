package cursors;

import java.util.Enumeration;
import java.util.Vector;

public class RetrievinDataWithEnumarator {

	public static void main(String[] args) {

		Vector v1 = new Vector();
		
		v1.addElement(10);
		v1.addElement(20);
		v1.addElement(30);
		v1.addElement("John");
		v1.addElement("Smith");
		v1.addElement("Computer");
		
		
		Enumeration e = v1.elements();
		
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		
		// for each loop		
		for (Object obj : v1) {
			System.out.println(obj);
		}
		
	

	}

}
