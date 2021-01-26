package interview;

public class CommandLineArguments {

	int global;
	String s1;

	public static void main(String[] args) {

		CommandLineArguments obj = new CommandLineArguments();

		int local;
		// System.out.println(local);
		System.out.println(obj.global);
		System.out.println(obj.s1);

	}

	static public void m1() {
		int local;
	}

	public static void m2() {
		int local;
	}
}
