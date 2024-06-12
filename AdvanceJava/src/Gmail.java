
public class Gmail {
	void login(String gmailAddress, String password) {
		System.out.println("User logged in with email address"+gmailAddress);
	}

	void login(long phoneNumber, String password) {
		System.out.println("User logged in with phoneNumber ");
	}

	public static void main(String[] args) {
		Gmail g = new Gmail();
		g.login("sahana85@gmail.com", "kh@1234");
		g.login(9845123456L, "kh@1234");
	}

}
