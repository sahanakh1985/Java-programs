package com.integerexample;

import java.util.Scanner;

public class SwappingProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 'x' value");
		int x = sc.nextInt();
		System.out.println("Enter the 'y' value");
		int y = sc.nextInt();
		// swap by using '+' and '-' operators

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println(" x :" + x);
		System.out.println(" y :" + y);

		System.out.println("----------------------");

		// swap by using '*' and '/' operators ,now the x=20 and y=10

		x = x * y;
		y = x / y;
		x = x / y;

		System.out.println(" x :" + x);
		System.out.println(" y :" + y);

	}

}
