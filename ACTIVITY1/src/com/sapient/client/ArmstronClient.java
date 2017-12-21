package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Armstrong;

public class ArmstronClient {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Armstrong o=new Armstrong();
		System.out.println(o.checkArms(num));
		sc.close();

	}

}
