package com.sapient.client;

public class Area {

	public static int calc(int side)
	{
		System.out.println("Integer args");
		return side*side;
	}
	public static double calc(double side)
	{
		System.out.println("Double args");
		return side*side;
	}
	public static void main(String[] args) {
		
		System.out.println(calc(5)+" "+calc(10.3));
	}

}
