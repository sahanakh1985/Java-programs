package com.array.example;

import java.util.Arrays;

public class InsertAnElementAtSpecifiedIndex {
	public static void main(String[] args) {
		int[] arr = { 32, 45, 12, 3, 67, 81 };
		int element = 20;
		int index = 2;

		int[] result = new int[arr.length + 1];

		for (int i = 0, j = 0; i < result.length; i++) {
			if (i == index) {
				result[i] = element;
			} else {
				result[i] = arr[j];
				j++;
			}

		}
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		System.out.println(Arrays.toString(result));
		System.out.println(result.length);
	}

}
