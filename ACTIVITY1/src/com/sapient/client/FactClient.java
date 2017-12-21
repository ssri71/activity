package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Factorial;

public class FactClient {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Factorial o=new Factorial();
		System.out.println(o.checkFact(num));
		sc.close();

	}

}
