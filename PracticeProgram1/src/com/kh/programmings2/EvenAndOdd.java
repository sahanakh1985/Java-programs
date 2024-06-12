package com.kh.programmings2;

import java.util.Scanner;

public class EvenAndOdd {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		int n = new Scanner(System.in).nextInt();

		if (n % 2 == 0) {
			System.out.println("the given number is even");

		} else {
			System.out.println("the given number is odd");

		}
	}

}
