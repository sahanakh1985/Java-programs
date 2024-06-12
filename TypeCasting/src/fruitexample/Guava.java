package fruitexample;

public class Guava extends Fruit {
	String name = "Guava";
	String color = "Green";
	int num = 10;
	boolean isSweet = true;

	@Override
	public String toString() {
		return "Guava [name=" + name + ", color=" + color + ", num=" + num + ", isSweet=" + isSweet + "]";
	}

}
