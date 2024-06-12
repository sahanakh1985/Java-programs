package com.swapping.programsexample;

public class Swap2NumbersWithTemporary {
	public static void main(String[] args) {

		int x = 10;
		int y = 20;

		int temp = x;// 10
		x = y;
		y = temp;
		System.out.println(x);// 20
		System.out.println(y);// 10

	}

}
