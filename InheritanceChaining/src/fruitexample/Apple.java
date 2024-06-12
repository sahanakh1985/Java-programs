package fruitexample;

public class Apple extends Fruit {

	boolean isSeedLess;

	Apple() {
		super("red");
	}

	Apple(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Apple [isSeedLess=" + isSeedLess + ", color=" + color + "]";
	}

	public static void main(String[] args) {

		Apple a1 = new Apple("Green");
		Apple a2 = new Apple();

		System.out.println(a1);

		System.out.println(a2.isSeedLess);
		System.out.println("Apple is  " + a2.color + " in color");
		a2.isSeedLess = true;
		System.out.println(a2.isSeedLess);

	}

}
