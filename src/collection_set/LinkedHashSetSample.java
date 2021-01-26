package collection_set;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetSample {

	public static void main(String[] args) {
		
		LinkedHashSet  h = new LinkedHashSet();
		
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
