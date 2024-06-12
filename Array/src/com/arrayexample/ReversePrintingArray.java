package com.arrayexample;

public class ReversePrintingArray {
	public static void main(String[] args) {
		int[] nums = { 23, 45, 61, 24, 16 };

		// reverse printing of array
		for (int i = nums.length - 1; i >= 0; i--) {
			System.out.println(nums[i]);
		}
	}

}
