package com.sorting.example;

import java.util.Scanner;

public class InsertionSortingOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		// int[] arr={5,1,6,2,4,3};
		int temp;
		int j;
		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			j = i;

			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j = j - 1;
			}
			arr[j] = temp;

		}
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + "");

		}

	}
}
