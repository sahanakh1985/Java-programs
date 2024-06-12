package com.hackathon;

import java.util.Scanner;

public class Test {

	public static int isPalindrome(int num) {
		int number = num, remainder = 0, reverse = 0, flag = 0;
		while (number != 0) {
			remainder = number % 10;
			number = number / 10;
			reverse = reverse * 10 + remainder;
		}
		if (reverse == num) {
			flag = 1;
		} else {
			flag = 0;
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = scan.nextInt();
		if (size == 0) {
			System.out.println("array should have at least 1 value");
			return;
		}
		System.out.println("enter the array values");
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		int flag = 0;
		for (int i = 0; i < arr.length; i++) {
			flag = isPalindrome(arr[i]);
			if (flag == 1) {
				System.out.println(arr[i] + " - Is Palindrome");
			}
		}
	}
}
