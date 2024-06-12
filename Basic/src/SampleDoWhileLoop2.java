import java.util.Scanner;

public class SampleDoWhileLoop2 {
	public static void main(String[] args) {
		// creating scanner object outside the loop
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("enter 2 numbers");
			int num1 = s.nextInt();
			int num2 = s.nextInt();
			System.out.println(num1 + num2);
			System.out.println("Do you want to add some more numbers?type true or false");

		} while (s.nextBoolean());
		// when the user enter true , the loop executes again
		// when the user enter false, the program terminates

	}

}
