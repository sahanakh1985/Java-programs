package com.kh.programmings2;

import java.util.Iterator;
import java.util.Scanner;

public class NumberOfEvenAndOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the array elements");

		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();

		}
		int even = 0;
		int odd = 0;

		for (int num : nums) {
			if (num % 2 == 0) {
				even++;

			} else {
				odd++;

			}

		}
		System.out.println("Even numbers :" + even);
		System.out.println("Odd numbers :" + odd);

	}

}
