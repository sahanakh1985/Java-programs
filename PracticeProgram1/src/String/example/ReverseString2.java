package String.example;

import java.util.Scanner;

public class ReverseString2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
		String input = sc.nextLine();
		int i = 0;
		int j = input.length() - 1;
		while (i <= j) {
			if (input.charAt(i) == input.charAt(j)) {
				i++;
				j--;

			} else {
				break;
			}

		}
		if (i > j) {
			System.out.println(input + " is a palindrome");
		} else {
			System.out.println(input + " is not a palindrome");
		}
	}

}
