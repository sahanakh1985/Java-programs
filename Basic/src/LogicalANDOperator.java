
public class LogicalANDOperator {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		if (++x <= 12 && y++ >= 20) {
			System.out.println("Hello");
		} else {
			System.out.println("World");
		}
		System.out.println(x);
		System.out.println(y);
	}

}
