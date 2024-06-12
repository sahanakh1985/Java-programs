package atmexample;

public class ATM {
	Money withDraw(Card card, int pin) {
		System.out.println(card);
		Money m = new Money(100);
		return m;

	}

	public static void main(String[] args) {
		ATM a = new ATM();
		Card c = new Card(2277777888L, 345, "Mastercard", "sahana");
		Money paisa = a.withDraw(c, 1234);
		System.out.println(paisa);

	}

}
