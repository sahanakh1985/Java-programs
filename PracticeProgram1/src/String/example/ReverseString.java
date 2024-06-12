package String.example;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println("Enter the input");
		String input = new Scanner(System.in).nextLine();
		String[] words = input.split(" ");
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");

		}
	}

}
