package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.round;

public class roundClient {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number and n decimal place\n");
		double num=sc.nextDouble();
		int n=sc.nextInt();
		System.out.println(round.roundTon(num));
		System.out.println(round.roundTon(n,num));
		sc.close();
	}

}
