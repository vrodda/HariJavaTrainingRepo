package cursors;

import java.util.ArrayList;

public class RetrievinDataWithForLoop {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add(10);
		list.add("John");
		list.add("Java");
		list.add(20);
		list.add(30);
		
		for (Object object : list) {
			
			System.out.println(object);
		}
		
	}
}
