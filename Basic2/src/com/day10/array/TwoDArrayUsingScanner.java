package com.day10.array;

import java.util.Scanner;

public class TwoDArrayUsingScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of rows");
		int row = sc.nextInt();
		System.out.println("enter the number of column");
		int column = sc.nextInt();
		int[][] arr = new int[row][column];
		System.out.println("enter all the array elements");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arr[i][j] = sc.nextInt();

			}

		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();

		}

	}

}
