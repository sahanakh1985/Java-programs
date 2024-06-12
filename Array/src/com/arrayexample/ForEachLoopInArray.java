package com.arrayexample;

public class ForEachLoopInArray {
	public static void main(String[] args) {
		int[] marks = { 32, 56, 79, 94 };
		for (int mark : marks) {
			System.out.print(mark + " ");

		}
		System.out.println();

		System.out.println("______________________________");

		String[] names = { "Alpha", "Beta", "Charlie" };
		for (String name : names) {
			System.out.println(name);

		}
	}

}
