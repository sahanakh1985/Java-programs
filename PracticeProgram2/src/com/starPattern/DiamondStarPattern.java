package com.starPattern;

import java.util.Iterator;
import java.util.Scanner;

public class DiamondStarPattern {

	public static void main(String[] args) {
		int row ,i,j,space=1;
		System.out.println("enter the number of rows");
		Scanner sc=new Scanner(System.in);
		row=sc.nextInt();
		
		space=row-1;
		for ( i = 0; i < row; i++) {
			for ( j = 0; j < space; j++) {
				System.out.println(" ");
				
			}
			space--;
			
		}
	}

}
