package objects;

public class Addition {

	//With Input and With returntype
	int add(int a, int b) {
		int c = a + b;
		return c;

	}

	// With Input and With no return output
	void sub(int a, int b) {
		int c = a - b;
		System.out.println(c);

	}

	// With No Input and With return type
	int mul() {
		int c = 100;
		return c;

	}

	// With No Input and With return type
	void div() {
		System.out.println("Division 200");

	}

}
