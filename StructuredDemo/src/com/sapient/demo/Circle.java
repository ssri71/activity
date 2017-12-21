package com.sapient.demo;

import java.util.Scanner;

public class Circle {
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		double radius=sc.nextDouble();
		System.out.println("Permimeter of circle is "+calArea(radius));
		System.out.println("Circumference of circle is "+calCircum(radius));
		sc.close();
	}
	public static double calArea(double radius){
		double area=Math.PI*radius*radius;
		return area;
	}
	public static double calCircum(double radius){
		double circum= 2*Math.PI*radius;
		return circum;
	}

}
