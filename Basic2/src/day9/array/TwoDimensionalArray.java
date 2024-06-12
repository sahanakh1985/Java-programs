package day9.array;

import java.util.Iterator;
import java.util.Scanner;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of row");
		int row = sc.nextInt();
		System.out.println("Enter the size of column");
		int column = sc.nextInt();
		System.out.println("enter the array elements");
		int[][] arr = new int[row][column];
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
