package collection_set;
import java.util.HashSet;

public class HashSetSample {

	public static void main(String[] args) {
		
		HashSet h = new HashSet();
		
		h.add("Ameer");
		h.add("Sharman");
		h.add("Madhavan");
		h.add("Chathur");
		h.add("Ameer");
		h.add("Smith");
		h.add("Smith");
		h.add(null);
		h.add(null);
		
		System.out.println(h);

	}

}
