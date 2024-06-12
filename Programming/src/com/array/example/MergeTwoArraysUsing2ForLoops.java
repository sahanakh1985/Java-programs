package com.array.example;

import java.util.Arrays;

public class MergeTwoArraysUsing2ForLoops {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 5, 6, 7, 8 };
		int[] result = new int[arr1.length + arr2.length];

		int i = 0;
		for (; i < arr1.length; i++) {
			result[i] = arr1[i];

		}
		for (int j = 0; i < arr2.length; j++) {
			result[i] = arr2[j];
			i++;

		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(result));

	}

}
