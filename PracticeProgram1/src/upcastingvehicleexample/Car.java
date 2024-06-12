package upcastingvehicleexample;

public class Car extends Vehicle {
	boolean isAutomatic;
	
	void cruiseControl() {
		System.out.println("Car is in auto pilot mode");
	}

	@Override
	public String toString() {
		return "Car [isAutomatic=" + isAutomatic + "]";
	}
	
	

}
