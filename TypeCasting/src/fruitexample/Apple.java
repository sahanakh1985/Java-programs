package fruitexample;

public class Apple extends Fruit {
	String name = "Apple";
	String color = "Red";
	int num = 20;
	boolean isSweet = true;

	@Override
	public String toString() {
		return "Apple [name=" + name + ", color=" + color + ", num=" + num + ", isSweet=" + isSweet + "]";
	}

}
