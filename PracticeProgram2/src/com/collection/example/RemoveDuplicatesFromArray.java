package com.collection.example;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesFromArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.println("enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Set<Integer> set = new LinkedHashSet<>();
		for (int j = 0; j < arr.length; j++) {
			set.add(arr[j]);
			int[] uniqueArr = new int[set.size()];
			int index = 0;
			for (int i : set) {

				uniqueArr[index++] = i;

			}
			System.out.println(Arrays.toString(arr));
			System.out.println(Arrays.toString(uniqueArr));

		}

	}
}
