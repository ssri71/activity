package com.sapient.demo;

import java.util.Scanner;

public class EnumDemo {
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first value");
		int v1=sc.nextInt();
		System.out.println("enter second value");
		int v2=sc.nextInt();
		System.out.println("Choose\n 1 -- Add\n 2 -- Substract\n 3 -- Multiply");
		String xyz=sc.next();
		try{
		Menu menu=Menu.valueOf(xyz.toUpperCase());
		switch(menu){
		case ADD:
			System.out.println("Add "+(v1+v2));
			break;
		case SUB:
			System.out.println("Subtract "+(v1-v2));
			break;
		case MULTIPLY:
			System.out.println("Multiply "+(v1*v2));
			break;
		default:
			System.out.println("invalid");
	}
		}
		catch (Exception ex){
			System.out.println("Invalid option");
		}
	}
	enum Menu{
		ADD,SUB,MULTIPLY
	}
}
