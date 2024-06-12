import java.util.Scanner;

public class StarNcrossN {
	// program to print N cross N (eg.5*5) with *(star)
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
				// i'm using print(),to print the star in the same line
			}
			System.out.println();// this statement will take the cursor to the next line
		}
	}

}
