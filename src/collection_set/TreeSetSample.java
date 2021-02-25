package collection_set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetSample {

	public static void main(String[] args) {

		TreeSet h = new TreeSet();

		h.add("Ameer");
		h.add("Ameer");
		h.add("Sharman");
		h.add("Madhavan");
		h.add("Chathur");

		// HasSet no insertion , no duplicates , Yes Null is allowed.
		// LinkedHashSet Yes insertion , no duplicates , Yes Null is allowed.
		// TreeSet -No Null is allowed

		System.out.println(h.first());
		System.out.println(h.last());

		System.out.println(h.headSet("Madhavan"));// gives the elements of less //than Madhavan

		System.out.println(h.tailSet("Chathur"));// gives the elements of //grater than Chathur
		
		
		System.out.println(h.subSet("Ameer", "Sharman"));// gives the elements //of grater than or equals to Ameer and less than Sharman


		System.out.println(h);

	}
}
