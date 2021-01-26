package collections_map;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		
        HashMap<Integer,String > m = new HashMap<Integer,String >();
       //1.	In HashMapTo check the duplicity of keys JVM uses .equals() method for Content comparison 		
	Integer i1 = new Integer(10);
	Integer i2 = new Integer(10);
	
	m.put(i1, "Sachin");
	m.put(i2, "Sehwag");
	
	System.out.println(m);

	}
}
