package com.methodsofcollectionexample;

import java.util.ArrayList;
import java.util.Arrays;

public class AdvanceMethodOfColletion {
	public static void main(String[] args) {
		ArrayList<Character> letter1 = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'E'));
		ArrayList<Character> letter2 = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd', 'e'));

		System.out.println(letter1.addAll(letter2));
		System.out.println(letter1.containsAll(letter2));
		System.out.println(letter1.get(3));
		System.out.println(letter2.get(4));
		System.out.println(letter1.indexOf(3));
		System.out.println(letter2.contains('t'));
		System.out.println(letter2.removeAll(letter2));

	}

}
