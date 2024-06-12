package com.array.example;

import java.util.Scanner;

public class SumOfArrayElements {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the  number of elements in the array");
		int n = scanner.nextInt();

		// creating an array with the given size
		int[] nums = new int[n];

		// store the user input elements in the array
		System.out.println("Enter the elements in the array");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = scanner.nextInt();
		}

			// adding the elements
			int sum = 0;
			for (int i : nums) {
				sum = sum + i;

			}
			System.out.println("Sum of all elements :" + sum);

		}

	}

