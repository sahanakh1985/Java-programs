package reversestring;

import java.util.Iterator;
import java.util.Scanner;

public class CustomReverseString {

	public static void main(String[] args) {
		System.out.println("Enter the input");
		String input = new Scanner(System.in).nextLine();

		int n = input.length();
		String rev = "";
		for (int i = n - 1; i >= 0; i--) {
			char temp = input.charAt(i);
			rev = rev + temp;

		}
		System.out.println(rev);
	}

}
