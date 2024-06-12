package weaponexample;

public class Weapon {
	String color;

	void clean() {
		System.out.println("clean the weapon");
	}

	public Weapon(String color) {
		this.color = color;
	}

	public static void main(String[] args) {
		Gun g = new Gun("Red");
		System.out.println(g);

		Bomb b = new Bomb();
		System.out.println(b);
	}

}
