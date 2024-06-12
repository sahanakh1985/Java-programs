package com.specialnumber;

import java.util.Scanner;

public class SpecialNumber {

	static int fact(int num) {
		int res = 1;
		for (int i = num; i >= num; i--) {
			res = res * i;

		}
		return res;

	}

	public static void main(String[] args) {
		System.out.println("Enter the number");
		int num = new Scanner(System.in).nextInt();

		int temp = num;
		int sum = 0;
		while (num > 0) {
			int last = num % 10;
			sum = sum + fact(last);
			num = num / 10;

		}
	
		System.out.println(temp + temp == sum ? "is a special number" : "is not a special number");
	}

}
