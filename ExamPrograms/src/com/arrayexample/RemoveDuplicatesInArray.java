package com.arrayexample;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		Set<Integer> set = new LinkedHashSet<>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}

		int index = 0;
		int[] uniqueArr = new int[set.size()];
		for (int element : set) {
			uniqueArr[index++] = element;

		}
		System.out.println("The array with duplicate elements :" + Arrays.toString(arr));
		System.out.println("The array with out duplicate elements :" + Arrays.toString(uniqueArr));

	}
}
