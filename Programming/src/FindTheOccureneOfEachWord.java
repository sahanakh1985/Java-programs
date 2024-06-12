import java.util.HashMap;

public class FindTheOccureneOfEachWord {
	public static void main(String[] args) {
		String s = "Hello how are you where are you what are you ";
		String[] words = s.split(" ");

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
