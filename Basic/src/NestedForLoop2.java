
public class NestedForLoop2 {
	public static void main(String[] args) {
		int table = 2;
		for (int i = 1; i <= table; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + "*" + j + "=" + (i * j) + "\t");

			}
			System.out.println();

		}

	}

}
