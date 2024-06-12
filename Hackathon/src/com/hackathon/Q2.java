package com.hackathon;

import java.util.Scanner;

public class Q2 {
	public static int fact(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;

		}
		return fact;
	}

	public static void main(String[] args) {
		System.out.println("enter the n value");
		int n = new Scanner(System.in).nextInt();

		int result = fact(n);
		System.out.println("The factorial of given number is: " + result);
	}
}
