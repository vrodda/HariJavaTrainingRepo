public class Test20 {

	public static void main(String[] args) {

		int totalmarks = 1000;

		// 500-600 marks is A grade
		// 400-500 B
		// 300-400 C
		// below 300 D
//ladder if / multiple if
		

			if (totalmarks >= 500 && totalmarks <= 600) {
				System.out.println("A grade");
			}

			else if (totalmarks >= 400 && totalmarks <= 500) {
				System.out.println("B grade");
			}

			else if (totalmarks >= 300 && totalmarks <= 400) {
				System.out.println("C grade");
			} else {
				System.out.println("D grade");
			}

		

	}
}
