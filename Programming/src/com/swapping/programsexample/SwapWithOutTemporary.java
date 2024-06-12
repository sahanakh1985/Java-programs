package com.swapping.programsexample;

public class SwapWithOutTemporary {
	public static void main(String[] args) {

		// Swap using + and - operators
		int x = 10;
		int y = 20;

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println(x);// 20
		System.out.println(y);// 10

		// swap using * and / operators

		x = x * y;
		y = x / y;
		x = x / y;

		System.out.println(x);// 10
		System.out.println(y);// 20

		// Swap using ^(exclusive or) operator
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		System.out.println(x);// 20
		System.out.println(y);// 10

	}
}
