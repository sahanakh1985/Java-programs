package day8.constructors;

public class Watch {
	String color;
	String brand;
	double price;

	Watch(String color, String brand,double price) {
		this.color = color;
		this.brand = brand;
		this.price = price;
	}

	public static void main(String[] args) {
		Watch w = new Watch("white", "fossil",20000);
		System.out.println(w.color);
		System.out.println(w.brand);
		System.out.println(w.price);
	}

}
