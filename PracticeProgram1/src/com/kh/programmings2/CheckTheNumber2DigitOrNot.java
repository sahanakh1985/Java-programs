package com.kh.programmings2;

import java.util.Scanner;

public class CheckTheNumber2DigitOrNot {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		int n = new Scanner(System.in).nextInt();
		if (n >= 10 && n <= 99) {
			System.out.println("The given number is 2 digit");

		} else {
			System.out.println("The given number is  not 2 digit");

		}
	}

}
