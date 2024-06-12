package com.array.examlple;

import java.util.HashMap;

public class OccuranceOfWordsInSentence {
	public static void main(String[] args) {
		String str = "how are you where are you whar are you";
		String[] words = str.split("");

		HashMap<String, Integer> map = new HashMap<>();
		for (String word : words) {
			if (map.containsKey(word)) {
				Integer value = map.get(word);
				map.put(word, value + 1);
			} else {
				map.put(word, 1);
			}

		}
		System.out.println(map);
		System.out.println(map.size());

	}

}
