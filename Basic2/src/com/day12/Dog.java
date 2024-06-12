package com.day12;

public class Dog extends Animal {
	public static void main(String[] args) {
		Dog d = new Dog();

		System.out.println(d.color);
		System.out.println(d.breed);
		System.out.println(d.age);

		d.eat();

	}

}
