
public class LogicalOROperator1 {
	public static void main(String[] args) {
		int x = 5;
		int y = 5;
		if (x++ >= 7 || ++y <= 6) {
			System.out.println("hello");
		} else {
			System.out.println("world");
		}

		System.out.println(x);
		System.out.println(y);

		// now we are using bitwise AND Operator(|)
		// now x value incremented by 1,so x=6 and y=6
		if (x++ <= 6 | ++y <= 6) {
			System.out.println("hello");
		} else {
			System.out.println("world");
		}

		System.out.println(x);
		System.out.println(y);
	}

}
