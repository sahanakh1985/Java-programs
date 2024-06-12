package com.armstrongnumber;

import java.util.Scanner;

public class SpecialNumber {
	static int fact(int n) {
		int res = 1;
		for (int i = n; i >= 2; i--) {
			res = res * i;

		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println("Enter the number");
		int n = new Scanner(System.in).nextInt();
		int temp = n;

		int sum = 0;
		while (n > 0) {
			int last = n % 10;
			sum = sum + fact(last);
			n = n / 10;

		}
		System.out.println(temp == sum ? "Special number" : "Not a special number");

	}

}
