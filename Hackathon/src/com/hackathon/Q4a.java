package com.hackathon;

import java.util.Iterator;
import java.util.Scanner;

public class Q4a {
	public static boolean isPalindrome(int n) {
		int temp = n;
		int rev = 0;
		while (n > 0) {
			int last = n % 10;
			rev = rev * 10 + last;
			n = n / 10;
		}
		if (temp == rev) {
			System.out.println(temp + " is a palindrome");
			return true;

		} else {
			System.out.println(temp + " is not a palindrome");
			return false;

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		for (int i = 0; i < arr.length; i++) {
			isPalindrome(arr[i]);

		}

	}
}
