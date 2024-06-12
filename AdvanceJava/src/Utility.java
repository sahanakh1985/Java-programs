import java.util.Scanner;

public class Utility {
	void greet(String name) {
		System.out.println("Hello " + name);
	}

	// method to count the no. of characters
	static int countCharactor(String word) {
		return word.length();
	}

	static String merge(String str1, String str2) {
		return (str1 + str2);
	}

	public static void main(String[] args) {
		// creating object of the utility class
		Utility u = new Utility();
		u.greet("Sahana");

		// creating a scanner object
		Scanner s = new Scanner(System.in);
		// accepting multi word input using nextLine()of scanner class and storing in
		// variable sentence
		System.out.println("Enter a sentence");
		String sentence = s.nextLine();
		// calling static method countCharacters and passing string as input and accept
		// int as return from method and storing in the length variable
		int length = Utility.countCharactor(sentence);
		System.out.println("The length of the given sentence is " + length);
		String merge = ("Hello " + "World");
		System.out.println("The merging sentence is " + merge);

	}

}
