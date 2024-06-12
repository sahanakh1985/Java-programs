
public class SwitchExample4 {
	public static void main(String[] args) {
		String formType = "registration";
		switch (formType) {
		case "login":
			System.out.println("user logged in");
			break;
		case "logout":
			System.out.println("user logged out");
			break;
		case "profile":
			System.out.println("user currently viewing his profile page");
			break;
		default:
			System.out.println("unsuitble case");
		}

	}

}
