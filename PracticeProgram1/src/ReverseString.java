import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		int n = new Scanner(System.in).nextInt();
		String num=n+"";

		StringBuilder sb = new StringBuilder(num);
		sb.reverse();
		String reverse = sb.toString();

		System.out.println(reverse.equals(num) ? "The number is palindrome" : "The number is not a palindrome");

	}

}
