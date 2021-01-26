package collections_map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class HashMapSample {

	public static void main(String[] args) {
		
		
		HashMap  map = new HashMap();
		
		map.put(108, null);
		map.put("Name", null);
		map.put(103, 1000);
		map.put(104, "John");
		map.put(105, "Amy");
		map.put(null, "Russel");
		map.put(null, "Smit");
		map.put(101, "AAAAAAA");
		
		Collections.synchronizedMap(map);
		
		System.out.println(map);
		
	Set s2 =	map.keySet();
	
	System.out.println(s2);
	
	System.out.println(map.values());
		

	}
	
}
