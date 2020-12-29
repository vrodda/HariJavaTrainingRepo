package flowcontrols;

import java.util.Scanner;

public class SwitchSample2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name : ");
		String name = scanner.next();
		
		switch (name) {
		
		case "Vijay":System.out.println("Sagar");
		break;
		
		case "Hari":System.out.println("Kumar");
		break;
		
		default:System.out.println("Invalid");
			break;
		}
		
	
		
		
		
		
		
		
		}
}
