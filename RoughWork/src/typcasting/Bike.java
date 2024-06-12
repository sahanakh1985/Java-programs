package typcasting;

public class Bike extends Vehicle {
	String color="Red";
	String brand="Skooty";
	double price=90000;
	boolean isKikkerAvailable;
	
	void kick() {
		System.out.println("Bike start by kicking");
	}

	@Override
	public String toString() {
		return "Bike [color=" + color + ", brand=" + brand + ", price=" + price + ", isKikkerAvailable="
				+ isKikkerAvailable + "]";
	}

	
}
