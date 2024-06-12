package com.array.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class DescendingOrderSorting {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 4, 7, 0, 3, 1, 5, 8 };

		TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
		set.addAll(Arrays.asList(3, 2, 4, 7, 0, 3, 1, 5, 8));
		System.out.println(set);
	}
}
