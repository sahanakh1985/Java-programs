package com.interfaceexamplewebdriver;

public class Firefox implements WebDriver {
	@Override
	public void get(String url) {
		System.out.println("Opening " + url + " in firefox browser");
	}

	@Override
	public void openPrivate() {
		System.out.println("Opening private window");
	}

}
