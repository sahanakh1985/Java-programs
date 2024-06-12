package vegetableexample;

public class Carrot extends Vegetable {
	String type;

	public Carrot(String color, String taste, String type) {
		super(color, taste);
		this.type = type;
	}

	@Override
	public String toString() {
		return "Carrot [type=" + type + ", color=" + color + ", taste=" + taste + "]";
	}

	public static void main(String[] args) {
		Carrot c = new Carrot("orange", "sweet", "Hybrid");
		System.out.println(c);
		System.out.println(c.taste);

	}

}
