package flowcontrols;

import java.util.Scanner;

public class IfSample1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any no.");
		int no = scanner.nextInt();
		
		if(no%2 ==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
		
		
		
		}
}
