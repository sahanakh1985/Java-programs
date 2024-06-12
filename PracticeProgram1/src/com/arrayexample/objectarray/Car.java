package com.arrayexample.objectarray;

public class Car {
	
	String regNo;
	String color;
	public Car(String regNo, String color) {
		this.regNo = regNo;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Car [regNo=" + regNo + ", color=" + color + "]";
	}
	public static void main(String[] args) {
		Car c1=new Car("KA011234","Red");
		Car c2=new Car("KA011244","Blue");
		
		Car[] cars= {c1,c1};
		for (Car car : cars) {
			System.out.println(car);
			
		}
	}
	
	
	

}
