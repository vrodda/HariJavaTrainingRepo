package flowcontrols;

import java.util.Scanner;

public class IfSample2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter marks : ");
		int marks = scanner.nextInt();
		
		if(marks>80 && marks <100)
			System.out.println("First Division");
		else if(marks>60 && marks <80)
			System.out.println("Second Division");
		else if(marks>40 && marks <60)
			System.out.println("Third Division");
		else
			System.out.println("Fail");
		
		
		
		
		
		}
}
