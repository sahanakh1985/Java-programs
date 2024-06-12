import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = s.nextLine();
		System.out.println("Enter the age");
		int age = s.nextInt();
		System.out.println("Enter the height");
		double height = s.nextDouble();
		System.out.println("Are you married");
		boolean maritalStatus = s.nextBoolean();
		s.close();// this is to close scanner input

		System.out.println("The details yo entered as follows:");

		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("Height:" + height);
		System.out.println("Is married:" + maritalStatus);

	}

}
