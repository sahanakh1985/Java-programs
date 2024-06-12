package com.array.example;

import java.util.Scanner;

public class CountEvenOddNumbers {
	public static void main(String[] args) {
		System.out.println("Enter the size of the array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter " + size + " elements into array");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();

		}
		int even = 0;
		int odd = 0;

		for (int i : nums) {
			if (i % 2 == 0) {
				even++;
			} else {
				odd++;
			}
			System.out.println("Even :" + even);
			System.out.println("Odd :" + odd);
		}
	}

}
