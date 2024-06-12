package com.armstrongnumber;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		int n=new Scanner(System.in).nextInt();
		
		for (int i = 1; i <=10; i++) {
			for (int j = 1; j < n; j++) {
				System.out.print(j+"*"+i+"="+(j*i)+"\t");
				
			}
			System.out.println(" ");
			
		}

	}

}
