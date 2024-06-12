package com.unchecked.exception;

import java.util.Scanner;

public class ArithmeticException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integers");
		int x = sc.nextInt();
		int y = sc.nextInt();
		try {
			int z = x / y;
			System.out.println("The result of division is :" + z);
		} catch (Exception e) {
			System.out.println("Run the program again ,please change the denominator");
		}
		System.out.println("End of the program");

	}
}
