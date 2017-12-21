package com.sapient.demo;

import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount");
		double amount=sc.nextDouble();
		System.out.println("Enter the years");
		int years=sc.nextInt();
		System.out.println("Enter the rate");
		float rate=sc.nextFloat();
		System.out.println("Simple interest is "+calSimple(amount,years,rate));
		System.out.println("Compund interest is "+calCompund(amount,years,rate));
		sc.close();
	}
	public static double calSimple(double amount,int years,float rate){
		double si=(amount*years*rate)/100;
		return si;
	}
	public static double calCompund(double amount,int years,float rate){
		double ci=amount*Math.pow((1+rate/100),years);
		return ci;
	}
}
