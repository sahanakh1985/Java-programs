package com.interfaceexamplewebdriver;

public class ChromeDriver implements WebDriver {
	@Override
	public void get(String url) {
		System.out.println("Opening " + url + " in chrome browser");
	}

	@Override
	public void openPrivate() {
		System.out.println("Opening incognito window");
	}

	public void inspectElement() {
		System.out.println("Opening developer inspect console in  chrome");

	}

}
