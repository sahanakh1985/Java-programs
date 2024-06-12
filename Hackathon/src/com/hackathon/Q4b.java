package com.hackathon;

import java.util.Scanner;

public class Q4b {

	// public class PalindromeChecker {
	public static int isPalindrome(int num) {
		int temp = num, remainder = 0, rev = 0, flag = 0;

		// Reversing the number
		while (num > 0) {
			remainder = num % 10;
			rev = rev * 10 + remainder;
			num = num / 10;
		}

		// Checking if the reversed number is equal to the original number
		if (rev == temp) {
			flag = 1;
		} else {
			flag = 0;
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();

		if (size <= 0) {
			System.out.println("Array size should be greater than 0.");
			return;
		}

		System.out.println("Enter the array elements:");
		int[] arr = new int[size];

		// Reading array elements
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Palindromes in the array:");

		// Checking each element for palindrome and printing if it is one
		for (int i = 0; i < arr.length; i++) {
			if (isPalindrome(arr[i]) == 1) {
				System.out.println(arr[i]);
			}
		}

	}
}
