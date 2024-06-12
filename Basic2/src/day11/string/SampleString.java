package day11.string;

public class SampleString {
	public static void main(String[] args) {

		String name1 = "priya";
		String name2 = "darshini";

		System.out.println(name1.length());// 5
		System.out.println(name1.concat(name2));// priyadarshini

		System.out.println(name2.toUpperCase());// DARSHINI
		System.out.println("SAHANA".toLowerCase());// sahana
		System.out.println(name1.charAt(3));// y
		System.out.println(name2.indexOf('s'));// 3
		String name = "   abc  ";
		System.out.println(name.trim());
		System.out.println(name1.isEmpty());// false
		System.out.println(name2.replace('r', '*'));// da*shini
		System.out.println(name2.substring(3));// shini
	
		System.out.println(String.valueOf(3.4));

	}

}
