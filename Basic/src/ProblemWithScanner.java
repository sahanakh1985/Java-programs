import java.util.Scanner;

public class ProblemWithScanner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter your id");
		int id = s.nextInt();
		s.nextLine();// to avoid the new line character left out by the previous input
		System.out.println("enter your name");
		String name = s.nextLine();
		s.close();

		System.out.println("Your details are:");
		System.out.println("Id:" + id);
		System.out.println("Name:" + name);
	}

}
