
public class ElseIfStatement1 {
	public static void main(String[] args) {
		int age = 56;
		if (age >= 0 && age <= 12) {
			System.out.println("child");
		} else if (age >= 13 && age <= 100) {
			System.out.println("adult");
		} else {
			System.out.println("wrong value");
		}

	}

}
