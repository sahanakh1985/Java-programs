import java.util.Scanner;

public class StarZ {
	// program to print letter 'Z'
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the N value");
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n - 1 || i + j == n - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();

		}

	}

}
