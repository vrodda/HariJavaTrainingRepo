package flowcontrols;

import java.util.Scanner;

public class SwitchSample1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter day number : ");
		int day = scanner.nextInt();
		
		switch (day) {
		case 1:System.out.println("Sunday");
		break;
		case 2:System.out.println("Mopnday");
		break;
		case 3:System.out.println("Tue");
		break;
		case 4:System.out.println("Wed");
		break;
		case 5:System.out.println("Thu");
		break;
		case 6:System.out.println("Fri");
		break;
		case 7:	System.out.println("Sat");
		break;

		default:System.out.println("Invalid");
			break;
		}
		
	
		
		
		
		
		
		
		}
}
