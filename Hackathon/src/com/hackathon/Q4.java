package com.hackathon;

import java.util.Scanner;

public class Q4 {
	public static int isPalindrome(int num) {
		// array of integers to check the palindrome of series
		int temp = num, remainder = 0, rev = 0, flag = 0;
		while (num > 0) {
			remainder = num % 10;
			rev = rev * 10 + remainder;
			num = num / 10;
		}

		if (rev == temp) {
			flag = 1;
		} else {
			flag = 0;
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		int size = sc.nextInt();

		if (size == 0) {
			System.out.println("size should have atleast 1 value");
		}
		System.out.println("enter the array elements");
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		int flag = 0;
		for (int i = 0; i < arr.length; i++) {
			flag = isPalindrome(arr[i]);
			if (flag == 1) {
				System.out.println(arr[i] + " is palindrome");

			}

		}
	}
}
