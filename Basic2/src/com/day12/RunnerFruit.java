package com.day12;

class Fruit {
	String color;
	boolean isSweet;

	void jam() {
		System.out.println("mixed fruit");
	}
}

class Apple extends Fruit {
	{
		color = "red";
		isSweet = true;
	}
}

public class RunnerFruit {
	public static void main(String[] args) {
		Apple a = new Apple();
		System.out.println(a.color);
		System.out.println(a.isSweet);
		a.jam();
	}

}