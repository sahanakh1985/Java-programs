package com.armstrongnumber;

import java.util.Iterator;
import java.util.Scanner;

public class FindingPower {
	static int pow(int m, int n) {
		int res = 1;
		for (int i = 0; i < n; i++) {
			res = res * m;

		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int power = pow(m, n);
		System.out.println(power);

	}

}
