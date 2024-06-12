package com.integerexample;

import java.util.Scanner;

public class FactorialNumber {
	static int fact(int n) {
		int res = 1;
		for (int i = n; i >= 2; i--) {
			res = res * i;

		}
		return res;
		
	}

	public static void main(String[] args) {
		System.out.println("enter the number");
		int n = new Scanner(System.in).nextInt();

		int result = fact(n);
		System.out.println("The factorial of " + n + " is :" + result);
	}

}
