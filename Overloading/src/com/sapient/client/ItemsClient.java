package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Items;

public class ItemsClient {

	public static void main(String[] args) {
		int []arr={3,12,23,6,12,56,21};
		System.out.println("Asc--1 or desc0--2");
		Scanner sc=new Scanner(System.in);
		int ch =sc.nextInt();
		Items i=new Items(); 
		switch (ch) {
		case 1:i.asc(arr);			
			break;
		case 2:i.desc(arr);
		break;
		default:System.out.println("Invalid choice");
			break;
		}
		sc.close();
	}

}
