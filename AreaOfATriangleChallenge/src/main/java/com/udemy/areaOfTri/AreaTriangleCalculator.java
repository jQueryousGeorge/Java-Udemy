package com.udemy.areaOfTri;
import java.util.Scanner;

public class AreaTriangleCalculator {
	// This class is responsible for taking a provided base and height of a triangle and calculating the area of said triangle.
	
	public static void Area() {
		/* 
		 * This was my first attempt at the challenge
		*/
		
		/* 
		int area, base, height;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hello, please give the base of the triangle:");
		String baseInput = input.next();
		base = Integer.parseInt(baseInput);
		
		System.out.println("Hello, please give the height of the triangle:");
		String heightInput = input.next();
		height = Integer.parseInt(heightInput);
		
		area = ((0.5 * base) * height);
		
		System.out.println(((0.5 * base) * height)); */
	}
	
	public static void AreaAnswer() {
		float base, height, area;
		
		System.out.println("Please enter a number for the base of the triangle : ");
		Scanner input = new Scanner(System.in);
		base = input.nextFloat();
		
		System.out.println("Please enter a number for the height of the triangle : ");
		height = input.nextFloat();
		input.close();
		
		area = (base * height) * 0.5f;
		System.out.println("The area of the triangle is : ");
		System.out.println(area);
	}
	
	public static void HeronsFormula() {
		float a, b, c, semiperimeter;
		double area;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the value of Side A of the triangle ....");
		a = input.nextFloat();
		
		System.out.println("Please enter the value of Side B of the triangle ....");
		b = input.nextFloat();
		
		System.out.println("Please enter the value of Side C of the triangle ....");
		c = input.nextFloat();
		input.close();
		
		semiperimeter = (a + b + c) * 0.5f;
		
		area = Math.sqrt((semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c) * semiperimeter);
		System.out.println("The area of the triangle is: " + area);
		
	}
	
	public static void main (String[] args)
	{
//		AreaAnswer();
		HeronsFormula();
	}
}