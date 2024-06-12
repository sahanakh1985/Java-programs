package gadgetexample;

import java.util.Random;

public class RelianceDigital {

	// instance method of RelianceDigital class
	Gadget luckyDraw() {
		// Random is a pre-defined class present in java.util
		// it is used to generate Random values
		Random r = new Random();
		int option = r.nextInt(10) + 1;
		System.out.println("You got lucky number " + option);
		if (option == 1) {
			return new Mobile();
		} else if (option == 2) {
			return new LapTop();
		} else if (option == 3) {
			return new SmartWatch();
		} else {
			return null;
		}
	}

	public static void main(String[] args) {
		RelianceDigital r = new RelianceDigital();
		Gadget g = r.luckyDraw(); // null
		if (g != null) {
			g.turnOn();
			if (g instanceof Mobile m) {
				m.call();
			} else if (g instanceof LapTop l) {
				l.executeProgram();
			} else if (g instanceof SmartWatch s) {
				s.startTimer();
			}
			g.turnOff();
		} else {
			System.out.println("No Gift, Better luck next time!!");
		}
	}
}
