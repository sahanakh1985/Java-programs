
public class Car {
	//default constructor method
	String color;
	String brand;
	boolean isAutomatic;

	Car() {
		this.color = null;
		this.brand = "BMW";
		this.isAutomatic = false;
	}

	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.color);//null
		System.out.println(c.brand);//BMW
		System.out.println(c.isAutomatic);//false

	}

}
