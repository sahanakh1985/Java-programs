package com.stringexample;

public class AddOddInArray {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int odd = 0;
		int even = 0;
		int sum = 0;
		for (int i : nums) {
			if (i % 2 == 0) {
				even++;
			} else {
				odd++;
			}
			sum = sum + odd;

		}
		System.out.println("sum of odd numbrers"+sum);
	}
}
