
public class SwitchStatement3 {
	public static void main(String[] args) {
		char input = 'N';
		switch (input) {
		case 'y', 'Y':
			System.out.println("Yes");
			break;
		case 'n', 'N':
			System.out.println("No");
			break;
		default:
			System.out.println("not a valid charactor");
		}

	}

}
