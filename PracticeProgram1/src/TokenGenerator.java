
public class TokenGenerator {
	// non-primitive datatype
	Token generateToken() {
		Token t = new Token(10);
		return t;
	}

	public static void main(String[] args) {
		TokenGenerator tg = new TokenGenerator();
		Token tokenChit = tg.generateToken();
		System.out.println(tokenChit);
	}

}
