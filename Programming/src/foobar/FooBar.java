package foobar;

public class FooBar {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " " + "foobar");

			} else if (i % 3 == 0) {
				System.out.println(i + " " + "foo");

			} else if (i % 5 == 0) {
				System.out.println(i + " " + "bar");
			}

		}

	}
}
