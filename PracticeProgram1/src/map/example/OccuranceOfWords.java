package map.example;

import java.util.HashMap;
import java.util.Scanner;

public class OccuranceOfWords {
	public static void main(String[] args) {
		System.out.println("enter the input");
		String input = new Scanner(System.in).nextLine();
		String[] words = input.split(" ");

		HashMap<String, Integer> map = new HashMap<>();
		for (String word : words) {

			if (map.containsKey(word)) {

				Integer value = map.get(word);
				map.put(word, value + 1);
			} else {
				map.put(word, 1);
			}
		}
		System.out.print(map);

	}

}
