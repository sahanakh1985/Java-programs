package com.Iteratorexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorCollectionSecondWay {
	public static void main(String[] args) {

		// instead of while loop use forEachRemaining()
		ArrayList<String> namesList = new ArrayList<>(Arrays.asList("RED", "Green", "Blue", "BLack"));
		System.out.println(namesList);
		Iterator<String> itr = namesList.iterator();
		itr.forEachRemaining(e -> {
			String x = itr.next();
			System.out.println("Remove the stored element  " + x);
			itr.remove();
		});
		System.out.println(namesList);

	}

}
