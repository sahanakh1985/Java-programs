package com.hackathon;

import java.util.Arrays;
import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int min, temp = 0;
		for (int i = 0; i < arr.length; i++) {
			min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[j]) < arr[min]) {
					min = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
	}

}
