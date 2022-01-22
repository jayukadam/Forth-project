package com.javaExpression;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
/**
 * 
 * write a program to calculate area of circle
 * 
 * points:
 * 1.use variable area,radius and pi value =3.14
 * 2.formula area=pi_value*radius*radius
 * 3.print the area value
 * 
 * NOTE: use scanner class to read the value from keyword
 * 
 */
		double area=0.0;
		final double pivalue=3.14;
		double radius;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter radius: ");
		radius = scn.nextDouble();
		area= pivalue*radius*radius;
		
		
	System.out.println("............");
	System.out.println(area);
	scn.close();
		
		
		
	}

}
