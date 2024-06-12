import java.util.HashSet;

public class FindTheNumberOfwordsInGivenSentence {
	public static void main(String[] args) {
		String s = "Hello world how are you what are you where are you";
		String[] words = s.split(" ");

		HashSet<String> h = new HashSet<>();
		for (String word : words) {
			h.add(word);

		}
		System.out.println(h);
		System.out.println("There are " + h.size() + " unique words in the given sentence");

	}

}
