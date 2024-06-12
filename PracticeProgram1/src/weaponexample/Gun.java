package weaponexample;

public class Gun extends Weapon {

	public Gun(String color) {
		super(color);

	}

	@Override
	public String toString() {
		return "Gun [color=" + color + "]";
	}

}
