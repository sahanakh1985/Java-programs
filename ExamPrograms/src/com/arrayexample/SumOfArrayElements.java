package com.arrayexample;

import java.util.Scanner;

public class SumOfArrayElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();

		System.out.println("Enter the array elements");
		int[] nums = new int[size];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();

		}
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];

		}
		System.out.println("Sum of array elements :" + sum);

	}

}
