package com.arrayexample;

public class Sample {
	public static void main(String[] args) {
		// dynamic array initialization
		int[] marks = { 32, 45, 67, 81 };
		System.out.println(marks[2]);// 67

		String[] names = { "Sahana", "Manya", "Dhanya" };
		System.out.println(names[1]);// Manya

		// find the length of an array using 'length' variable
		System.out.println(names.length);
		System.out.println(marks.length);
	}

}
