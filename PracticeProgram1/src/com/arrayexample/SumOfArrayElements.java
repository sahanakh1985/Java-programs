package com.arrayexample;

public class SumOfArrayElements {
	public static void main(String[] args) {
		int[] nums = { 10, 20, 30, 40, 50 };
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
		}
		System.out.println(" Sum of array elements :" + sum);
	}
}
