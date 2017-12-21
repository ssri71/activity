package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Factorian;

public class FactorianClient {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Factorian o=new Factorian();
		System.out.println(o.checkFactorian(num));
		sc.close();

	}

}