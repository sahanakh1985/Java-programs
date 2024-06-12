package Com.abstractbeacon;

public class Beacon extends AbstractBeacon {

	@Override
	void sendSignal() {
		System.out.println("Sending signal");

	}

	void turnOn() {
		System.out.println("Turn on the beacon");
	}

	void turnOff() {
		System.out.println("Turn off the beacon");
	}

}
