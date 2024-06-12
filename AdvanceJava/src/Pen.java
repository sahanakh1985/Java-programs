
public class Pen {
	//parameterized constructor
	String color;

	Pen(String color) {

		this.color = color;
	}

	public static void main(String[] args) {
		Pen p1 = new Pen("Red");

		Pen p2 = new Pen("Pink");

		Pen p3 = new Pen("Green");

		Pen p4 = new Pen("Blue");
		System.out.println(p1.color);
		System.out.println(p2.color);
		System.out.println(p3.color);
		System.out.println(p4.color);

	}

}
