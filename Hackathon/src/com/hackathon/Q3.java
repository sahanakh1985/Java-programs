package com.hackathon;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {

	// sort array of integers
	public static void displayArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void quickSort(int[] arr, int low, int high) {
		if (arr == null || arr.length == 0)
			return;
		if (low >= high)
			return;
		int middle = low + (high - low) / 2;
		int pivot = arr[middle];
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
			while (arr[j] > pivot) {
				j--;
			}
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		if (low < j)
			quickSort(arr, low, j);
		if (high > i)
			quickSort(arr, i, high);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = scan.nextInt();
		System.out.println("enter the array values");
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		int low = 0;
		int high = arr.length - 1;
		quickSort(arr, low, high);
		displayArray(arr);
	}
}
