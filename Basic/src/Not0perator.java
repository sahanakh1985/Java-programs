
public class Not0perator {
	public static void main(String[] args) {
		/*
		 * System.out.println(!(5 <= 7)); System.out.println(!!!!!!(4 <= 4));
		 * System.out.println(!(70 > 39));
		 */

		int x = 6;
		int y = 7;
		if (!!!!!(++x <= 6 || ++y <= 8)) {// this 'if' condition is true
			System.out.println("java");
		} else {
			System.out.println("python");

		}
		System.out.println(x);
		System.out.println(y);

	}

}
