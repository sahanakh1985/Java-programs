package com.arrayexample;

import java.util.Iterator;

public class ModificationInArrayPrinting {
	public static void main(String[] args) {
		int[] nums = { 10, 20, 30, 40, 50, 60 };
		// print the array elements in forward direction
		System.out.println("Print the array elements in forward direction");
		for (int i = 0; i <= nums.length - 1; i++) {
			System.out.print(nums[i] + " ");
			

		}
		System.out.println();
		// print the array in back ward direction
		System.out.println("Print the array in back ward direction ");
		for (int i = nums.length - 1; i >= 0; i--) {
			System.out.print(nums[i] + " ");

		}
		System.out.println();
		// printing the first half array in forward direction
		System.out.println("Print the first half of an array in forward direction ");
		for (int i = 0; i < (nums.length) / 2; i++) {
			System.out.print(nums[i] + " ");

		}
		System.out.println();
		// printing the first half array in back ward direction
		System.out.println(" Print the first half of an array in back ward direction ");
		for (int i = (nums.length - 1) / 2; i >= 0; i--) {
			System.out.print(nums[i] + " ");

		}
		System.out.println();
		// printing the second half of an array in backward direction
		System.out.println("Print the second half of an array in backward direction ");
		for (int i = nums.length - 1; i > (nums.length - 1) / 2; i--) {
			System.out.print(nums[i] + " ");

		}
		System.out.println();
		// printing the second half of an array in for ward direction
		System.out.println("Print the second half of an array in for ward direction ");
		for (int i = nums.length / 2; i < nums.length; i++) {
			System.out.print(nums[i] + " ");

		}

	}
}
