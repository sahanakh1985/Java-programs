package com.interfaceexamplewebdriver;

public class RunnerWebDriver {
	public static void main(String[] args) {
		WebDriver w = new ChromeDriver();
		w.get("https://www.google.com");
		w.openPrivate();

		if (w instanceof ChromeDriver c) {
			c.inspectElement();
		}
	}

}
