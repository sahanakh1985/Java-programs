package com.positiveornegativenumber;

import java.util.Scanner;

public class PositiveOrNegativeNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		int n = new Scanner(System.in).nextInt();

		//we are using ternary operator ,
		//instead of ternary operator we can use 'if-else' statement
		System.out.println((n >= 0) ? "Positive" : "Negative");
	}

}
