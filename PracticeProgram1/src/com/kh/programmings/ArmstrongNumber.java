package com.kh.programmings;

import java.util.Iterator;
import java.util.Scanner;

public class ArmstrongNumber {
	// count the number of digits

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
		for (int i = 0; i < n; i++) {
			res = res * m;

		}
		return res;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int temp = n;
		int count = countDigit(n);

		int sumofAllDigits = 0;
		while (n > 0) {
			int last = n % 10;
			sumofAllDigits = sumofAllDigits + pow(last, count);
			n = n / 10;
		}
		System.out.println((temp == sumofAllDigits) ? "It is an amstrong number" : "It is not an amstrong number");

	}

}
