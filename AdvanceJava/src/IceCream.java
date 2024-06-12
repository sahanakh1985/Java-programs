
public class IceCream {
	// constructor overloading method
	String flavour;
	char size;
	double price;

	// ALT + SHIFT+ + S + O(OWE)->Generate constructor using fields
	IceCream(String flavour) {
		this.flavour = flavour;
	}

	
	IceCream(String flavour, char size) {
		this.flavour = flavour;
		this.size = size;
	}

	IceCream(String flavour, char size, double price) {
		this.flavour = flavour;
		this.size = size;
		this.price = price;
	}

	public static void main(String[] args) {
		IceCream i1 = new IceCream("vannila");
		IceCream i2 = new IceCream("mango", 'L');
		IceCream i3 = new IceCream("Orange", 'M', 30.0);
		IceCream i4 = new IceCream("Chocolte", 'S');

		System.out.println(i1.flavour);
		System.out.println(i2.flavour);
		System.out.println(i3.price);

	}

}
