package com.kh.programmings2;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();

		int fact = 1;
		for (int i = n; i >= 2; i--) {
			fact = fact * i;

		}
		System.out.println("The factorial of " + n + " is " + fact);

	}
}
