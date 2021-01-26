package collections_map;

import java.util.IdentityHashMap;

public class IdentityHashMap1 {

	public static void main(String[] args) {
		
        IdentityHashMap m = new IdentityHashMap();
      //2.	In IdentityHashMapTo check the duplicity of keys JVM uses    ==  for reference comparison
        
	Integer i1 = new Integer(10);
	Integer i2 = new Integer(10);
	
	m.put(i1, "Sachin");
	m.put(i2, "Sehwag");
	
	System.out.println(m);

	}
}
