package com.kh.abstractexmple;

public class RunnerBeacon {

	public static void main(String[] args) {
		AbstractBeacon a = new Beacon();
		a.sendSignal();

		if (a instanceof Beacon) {
			Beacon b = (Beacon) a;
			b.turnOn();
			b.turnoff();

		}

	}

}
