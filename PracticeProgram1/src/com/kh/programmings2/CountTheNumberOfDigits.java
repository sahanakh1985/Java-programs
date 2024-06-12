package com.kh.programmings2;

import java.util.Scanner;

public class CountTheNumberOfDigits {
	public static void main(String[] args) {

		System.out.println("enter the number");
		int n = new Scanner(System.in).nextInt();

		int count = 0;
		while (n > 0) {
			count++;
			n = n / 10;

		}
		System.out.println("The Number of digits in given number :" + count);
	}

}
