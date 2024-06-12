package atmexample;

public class Card {
	long cardNum;
	int cvv;
	String type;
	String cardHolderName;

	public Card(long cardNum, int cvv, String type, String cardHolderName) {
		this.cardNum = cardNum;
		this.cvv = cvv;
		this.type = type;
		this.cardHolderName = cardHolderName;

	}

	@Override
	public String toString() {
		return "Card [cardNum=" + cardNum + ", cvv=" + cvv + ", type=" + type + ", cardHolderName=" + cardHolderName
				+ "]";
	}

}
