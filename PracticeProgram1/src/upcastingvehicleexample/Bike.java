package upcastingvehicleexample;

public class Bike  extends Vehicle{
	
	boolean isKickerAvailable;
	
	void kick() {
		System.out.println("kick the bike");
		
		
	}

	@Override
	public String toString() {
		return "Bike [isKickerAvailable=" + isKickerAvailable + "]";
	}

}
