
public class ElseIfConditionalStatement {
	public static void main(String[] args) {
		int marks = 75;

		if (marks >= 85) {
			System.out.println("Distinction");
		} else if (marks <= 85 && marks >= 60) {
			System.out.println("First class");
		} else if (marks >= 50 && marks <= 60) {
			System.out.println("Second class");
		} else if (marks > 35 && marks <= 50) {
			System.out.println("Third class");
		} else {
			System.out.println("Fail");

		}
	}
}
