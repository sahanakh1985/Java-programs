package com.checked.exception;

import java.util.Iterator;

public class SamplePauseProgram {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End of the program");
	}

}
