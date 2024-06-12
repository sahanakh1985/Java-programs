package com.day12;

public class RunnerAnimal {
	public static void main(String[] args) {
		Dog d = new Dog();
		System.out.println("color is :" + d.color);
		System.out.println("Age is :" + d.age);
		System.out.println("Breed is :" + d.breed);

		d.eat();
	}

}
