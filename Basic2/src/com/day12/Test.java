package com.day12;

class Add {
	int a = 10;
	int b = 20;

	void sum() {
		System.out.println("sum:" + (a + b));
	}

	/*
	 * public static void main(String[] args) { Division d = new Division();
	 * d.sum(); d.sub(); d.mul(); d.div(); }
	 */

}

class Subtract extends Add {
	void sub() {
		System.out.println("sub:" + (b - a));

	}
}

class Multiplication extends Subtract {
	void mul() {
		System.out.println("Multiplication:" + (a * b));
	}

}

class Division extends Multiplication {
	void div() {
		System.out.println("Division:" + (b / a));
	}
}

public class Test {

	public static void main(String[] args) {
		Division d = new Division();
		d.sum();
		d.sub();
		d.mul();
		d.div();

	}

}
