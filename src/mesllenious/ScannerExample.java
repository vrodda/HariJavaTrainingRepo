package mesllenious;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Roll Number");
		int rollNo = sc.nextInt();

		System.out.println("Enter Name");
		String name = sc.next();

		System.out.println("Enter Age");
		String age = sc.next();
					
		System.out.println(rollNo + " " +name +" "+age);
	}
}
