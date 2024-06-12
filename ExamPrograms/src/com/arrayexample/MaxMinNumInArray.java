package com.arrayexample;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinNumInArray {
	public static void main(String[] args) {

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();

		System.out.println("Enter the array elements");
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			if (min > arr[i]) {
				min = arr[i];
			}

			if (max < arr[i]) {
				max = arr[i];
			}

		}
		System.out.println("The given array is :" + Arrays.toString(arr));
		System.out.println("The minimum number in array is :" + min);
		System.out.println("The maximum number in array is :" + max);

	}
}
