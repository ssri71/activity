package com.sapient.service;

import java.util.Scanner;

import com.sapient.client.LeapYrClient;

public class LeapyrOO {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		LeapYrClient o=new LeapYrClient();
		System.out.println(o.Leap(year));
		sc.close();
		}
}
