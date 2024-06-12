package Com.abstractbeacon;

public class RunnerBeacon {
	public static void main(String[] args) {
		AbstractBeacon ab = new Beacon();// up casting

		ab.sendSignal();
		if (ab instanceof Beacon b) {// down casting
			b.turnOn();
			b.turnOff();
		}

	}
}
