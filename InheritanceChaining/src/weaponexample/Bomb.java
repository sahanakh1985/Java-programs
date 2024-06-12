package weaponexample;

public class Bomb extends Weapon {
	Bomb() {
		super("Green");
	}

	@Override
	public String toString() {
		return "Bomb [color=" + color + "]";
	}

	public static void main(String[] args) {

		Bomb b = new Bomb();
		Gun g = new Gun("Red");
		System.out.println(b);
		System.out.println(g);
		System.out.println(b.color);
		System.out.println(g.color);

	}

}
