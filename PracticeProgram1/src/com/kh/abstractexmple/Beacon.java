package com.kh.abstractexmple;

public class Beacon extends AbstractBeacon {

	@Override
	void sendSignal() {
		System.out.println("Beacon sending signal");

	}

	void turnOn() {
		System.out.println("Turn on the beacon");
	}

	void turnoff() {
		System.out.println("Turn off the beacon");
	}

}
