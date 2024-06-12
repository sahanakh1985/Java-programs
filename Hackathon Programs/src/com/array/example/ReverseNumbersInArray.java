package com.array.example;

import java.util.Arrays;

public class ReverseNumbersInArray {

	public static void main(String[] args) {
		int[] arr = { 3, 2, 4, 7, 0, 3, 1, 5, 8, 4 };
		int[] arr1 = new int[arr.length / 3];
		int[] arr2 = new int[arr.length / 3];
		int[] arr3 = new int[arr.length / 3];

		for (int i = arr.length - 1; i >= 0; i--) {

		}
		for (int i = (arr.length / 3)-1; i >= 0; i--) {
			if (arr.length > i) {
				arr1[i] = i;
			}

		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));

	}

}
