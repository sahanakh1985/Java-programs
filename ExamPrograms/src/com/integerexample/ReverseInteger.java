package com.integerexample;

import java.util.Scanner;

public class ReverseInteger {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		int n = new Scanner(System.in).nextInt();

		int reverseInt = 0;
		while (n > 0) {
			int last = n % 10;
			reverseInt = reverseInt * 10 + last;
			n = n / 10;

		}
		System.out.println("Reverse of the given integer is :" + reverseInt);

	}

}
