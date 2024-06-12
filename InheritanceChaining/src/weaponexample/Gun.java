package weaponexample;

public class Gun extends Weapon {

	Gun(String color) {
		super(color);
	}

	@Override
	public String toString() {
		return "Gun [color=" + color + "]";
	}

}
