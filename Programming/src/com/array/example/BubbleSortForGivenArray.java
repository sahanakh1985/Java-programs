package com.array.example;

import java.util.Arrays;

public class BubbleSortForGivenArray {
	public static void main(String[] args) {
		// bubble sort in ascending order
		int[] arr = { 20, 5, 6, 10, 3, 53, 96 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if ((arr[j]) > (arr[j + 1])) {
					// for descending order the code is
					// if ((arr[j]) > (arr[j + 1])) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}

		}
		System.out.println(Arrays.toString(arr));
	}

}
