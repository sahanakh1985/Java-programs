package com.armstrongnumber;

import java.util.Scanner;

public class ReversePalindrome {

	public static void main(String[] args) {
		System.out.println("enter the number");
		int n = new Scanner(System.in).nextInt();
		int temp = n;
		int rev = 0;
		int sum = 0;

		while (n > 0) {
			int last = n % 10;
			sum = sum + last;
			rev = rev * 10 + last;
			n = n / 10;

		}
		System.out.println(temp == rev ? "Palindrome" : "Not a palindrome");
		System.out.println(sum);

	}

}
