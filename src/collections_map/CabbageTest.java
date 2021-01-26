package collections_map;

import java.util.WeakHashMap;

public class CabbageTest {

	public static void main(String[] args)throws Exception {
		
		Cabbage cabbage = new Cabbage();
		
		WeakHashMap   m = new WeakHashMap();
		
		m.put(cabbage,"Vegetable");
		System.out.println(m);
		
		cabbage = null;
		
		System.gc();
		
		Thread.sleep(5000);
		
		System.out.println(m);
		
		
	}

}
