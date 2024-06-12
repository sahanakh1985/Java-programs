package Com.trai.simexample;

public class RunnerSim {
	public static void main(String[] args) {
		AbstractSim a = new JioSim(); // up casting
		a.call();
		a.sms();
		a.sos();
		// to access subclass specific method
		// we have to down cast
		// to avoid class casting we use "instanceof" operator
		if (a instanceof JioSim j) {
			j.jioTv();
		}

	}
}
