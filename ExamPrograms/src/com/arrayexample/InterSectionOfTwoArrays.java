package com.arrayexample;

import java.util.Arrays;
import java.util.Scanner;

public class InterSectionOfTwoArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of first array");
		int size = sc.nextInt();
		System.out.println("Enter the elements of first array");
		int[] arr1 = new int[size];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();

		}
		System.out.println("Enter the size of second array");
		int size2 = sc.nextInt();
		System.out.println("Enter the elements of second array");
		int[] arr2 = new int[size2];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();

		}
		int[] result = new int[arr1.length + arr2.length];
		System.out.println(result.length);
		for (int i = 0, j = 0; i < result.length; i++) {
			if (i < arr1.length) {
				result[i] = arr1[i];
			} else {
				result[i] = arr2[j];
				j++;

			}

		}
		System.out.println("First array is : " + Arrays.toString(arr1));
		System.out.println("Second array is : " + Arrays.toString(arr2));
		System.out.println("Resultant array is : " + Arrays.toString(result));

	}

}
