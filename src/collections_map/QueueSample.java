package collections_map;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueSample {

	public static void main(String[] args) {

		Queue h = new ArrayBlockingQueue<>(10);

		h.add("Ameer");
		h.add("Sharman");
		h.add("Madhavan");
		h.add("Chathur");
		h.add("Smith");

		System.out.println(h.peek());

		h.remove();

		System.out.println(h);
	}

}
