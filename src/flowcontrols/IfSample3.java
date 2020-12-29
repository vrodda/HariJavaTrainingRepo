package flowcontrols;

import java.util.Scanner;

public class IfSample3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter day number : ");
		int day = scanner.nextInt();
		
		if(day==1)
			System.out.println("Sunday");
		else if(day==2)
			System.out.println("Mopnday");
		else if(day==3)
			System.out.println("Tue");
		else if(day==4)
			System.out.println("Wed");
		else if(day==5)
			System.out.println("Thu");
		else if(day==6)
			System.out.println("Fri");
		else if(day==7)
			System.out.println("Sat");
		else
			System.out.println("Invalid");
		
		
		
		
		
		
		}
}
