package com.armstrongnumber;

import java.util.Scanner;

//import java.util.Scanner;

public class ArmstrongNumber {

	static int countDigit(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n /= 10;
		}
		return count;
	}

	static int pow(int m, int n) {
		int res = 1;
		for (int i = 1; i <= n; i++) {
			res = res * m;

		}
		return res;
	}

	public static void main(String[] args) {

		System.out.println("Enter the value of n");
		int n = new Scanner(System.in).nextInt();
		int temp = n; // to keep the original n value for comparision at last

		int count = countDigit(n);
		int sumOfAllDigits = 0;

		while (n > 0) {
			int last = n % 10;
			sumOfAllDigits = sumOfAllDigits + pow(last, count);
			n = n /= 10;

		}
		System.out.println(temp == sumOfAllDigits ? "Armstrong number" : "Not an armstrong number");

		/*
		 * int res = countDigit(1534); System.out.println(res);
		 * 
		 * System.out.println(pow(3, 3));
		 */

	}
}
