import java.util.Scanner;

public class SampleScannerInput {
	public static void main(String[] args) {
		int input;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the input");
		input = s.nextInt();
		s.nextLine();// to avoid the new line character left out by the previous input
		System.out.println(input);

		// String word=s.next();, it will accept one word string input
		System.out.println("enter the message");
		String message = s.nextLine();
		System.out.println("The message is: " + message);
//in this program i am using integer variable before the string
	}

}
