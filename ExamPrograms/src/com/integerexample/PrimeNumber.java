package com.integerexample;

import java.util.Scanner;

public class PrimeNumber {
	static boolean checkPrime(int n) {
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				return false;
			} else {
				return true;
			}

		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();

		System.out.println(n + " is " + (checkPrime(n) ? "a prime number" : "not a prime number"));

	}

}
