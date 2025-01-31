
public class TShirt {
	// constructor chaining program
	String color;
	char size;
	double price;

	TShirt(String color, char size, double price) {
		this(size, color, price); // calling last constructor
	}

	TShirt(String color, double price) {
		this('\u0000', color, price);// calling last constructor
	}

	TShirt(String color) {
		this(color, 'M', 500.0); // calling first constructor from third constructor
		System.out.println("hello");
	}

	@Override
	public String toString() {
		return "TShirt [color=" + color + ", size=" + size + ", price=" + price + "]";
	}

	TShirt(char size, String color, double price) {
		this.size = size;
		this.color = color;
		this.price = price;
	}

	public static void main(String[] args) {
		TShirt t = new TShirt("Green");
		TShirt t1 = new TShirt("Pink", 600.0);
		TShirt t2 = new TShirt('R', "Blue", 1000.0);
		System.out.println(t.size);
		System.out.println(t.color);
		t.color = "Red";
		System.out.println(t.price);
		System.out.println(t);
		System.out.println(t.color);
		System.out.println(t1.price);
		System.out.println(t2.color);
		System.out.println(t2);
	}
}
