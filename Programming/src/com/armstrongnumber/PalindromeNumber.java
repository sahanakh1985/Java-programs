package com.armstrongnumber;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		int n = new Scanner(System.in).nextInt();

		String num = n + "";

		StringBuilder sb = new StringBuilder(num);
		sb.reverse();
		String rev = sb.toString();
		System.out.println(rev.equals(num) ? "palindrome number" : "Not a palindrome number");

	}

}
