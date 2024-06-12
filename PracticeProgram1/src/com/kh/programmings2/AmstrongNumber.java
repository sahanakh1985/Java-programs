package com.kh.programmings2;

import java.util.Scanner;

public class AmstrongNumber {
	static int countDigit(int num) {
		int count = 0;
		while (num > 0) {
			count++;
			num = num / 10;

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
		System.out.println("Enter the number");
		int n = new Scanner(System.in).nextInt();

		int temp = n;
		int count = countDigit(n);
		int sumOfDigits = 0;

		while (n > 0) {
			int last = n % 10;
			sumOfDigits = sumOfDigits + pow(last, count);
			n = n / 10;

		}
		System.out.println((temp == sumOfDigits)?"AmstrongNumber":"not an amstrong number");

	}

}
