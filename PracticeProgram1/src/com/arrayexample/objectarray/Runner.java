package com.arrayexample.objectarray;

public class Runner {
	public static void main(String[] args) {

		Student s = new Student(3, "Ammu", 6);
		Car c = new Car("KA032398", "white");

		Object[] objs = { s, c };
		System.out.println(objs.length);

		for (Object obj : objs) {
			System.out.println(obj);

			Object obj1 = s;

			if (obj instanceof Student s1) {
				System.out.println("Name of the student :" + s1.name);

			} else if (obj instanceof Car c1) {
				System.out.println("Color of the car :" + c1.color);

			}

		}
	}

}
