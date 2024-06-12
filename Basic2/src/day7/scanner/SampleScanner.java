package day7.scanner;

import java.util.Scanner;

public class SampleScanner {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// to take integer input
		System.out.println("enter the number");
		int num = sc.nextInt(); // input
		System.out.println(num); // output

		// to take String input
		System.out.println("enter the name");
		String name = sc.next();
		System.out.println(name);

	}

}
