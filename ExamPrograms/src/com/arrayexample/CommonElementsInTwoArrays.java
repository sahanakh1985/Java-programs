package com.arrayexample;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class CommonElementsInTwoArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of  the first array ");
		int size1 = sc.nextInt();
		int[] arr1 = new int[size1];
		System.out.println("Enter the elements of array");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();

		}
		System.out.println("Enter the size of  the second array ");
		int size2 = sc.nextInt();
		int[] arr2 = new int[size2];
		System.out.println("Enter the elements of array");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();

		}
		Set<Integer> commonElement = new LinkedHashSet<>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					commonElement.add(arr2[j]);		//commomElement.add(arr1[i]);

				}

			}

		}
		System.out.println("First array :" + Arrays.toString(arr1));
		System.out.println("Second array :" + Arrays.toString(arr2));
		System.out.println("The common elements in between two arrays are :" + commonElement);
	}

}
