package com.array.example;

import java.util.Scanner;

public class FindMinMaxNumber {
	public static void main(String[] args) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		// System.out.println("Enter all the array elements");
		int[] arr = { 23, 45, 67, 8, 9, 123, 456, 65, 3, 2345 };

		for (int i : arr) {
			if (min > i) {
				min = i;
			}
			if (max < i) {
				max = i;
			}

		}
		System.out.println("Max number is :" + max);
		System.out.println("Min number is :" + min);

	}

}
