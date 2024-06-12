package com.object.arrayexample;

import java.util.Arrays;

public class RunnerObject {
	public static void main(String[] args) {

		Student s = new Student(2, "Sagar", 25);

		Car c = new Car("KA01DF1234", "Red");

		Object[] objs = { s, c };
		System.out.println(objs.length);

		// print the object array using for-each loop
		for (Object obj : objs) {
			System.out.println(obj);
			if (obj instanceof Student st) {
				System.out.println(st.name);
				System.out.println(st.age);
				System.out.println(st.slNO);

			} else if (obj instanceof Car cr) {
				System.out.println(cr.color);
				System.out.println(cr.regNo);

			}

		}
	}
}
