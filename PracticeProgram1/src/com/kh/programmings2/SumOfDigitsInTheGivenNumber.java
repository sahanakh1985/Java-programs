package com.kh.programmings2;

import java.util.Scanner;

public class SumOfDigitsInTheGivenNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		int n = new Scanner(System.in).nextInt();

		int sum = 0;
		while (n > 0) {
			int last = n % 10;
			sum = sum + last;
			n = n / 10;

		}
		System.out.println("Sum o digits in given number :" + sum);

	}

}
