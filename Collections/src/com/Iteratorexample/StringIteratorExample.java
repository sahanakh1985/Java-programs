package com.Iteratorexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class StringIteratorExample {
	public static void main(String[] args) {
		ArrayList<String> namesList = new ArrayList<>(Arrays.asList("Sahana", "Ammu", "Siri", "Sadhana"));
		System.out.println(namesList);
		Iterator<String> itr = namesList.iterator();
		while (itr.hasNext()) {
			String x = itr.next();
			System.out.println("Removing the element  " + x);
			itr.remove();

		}
		System.out.println(namesList);
	}

}
