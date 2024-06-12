package com.day10.array;

import java.util.Scanner;

public class OneDimesionArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter all the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");

		}
		System.out.println();

	}

}
