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
		
		
	Enumeration em =	v1.elements();
	
	while (em.hasMoreElements()) {
		 
		System.out.println(em.nextElement());
		
	}
	

	}

}
