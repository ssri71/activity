package com.sapient.client;
import com.sapient.service.*;
import java.util.Scanner;

public class mtableclient {
	public static void main(String[] args)
	{
		System.out.println("enter no");
		Scanner sc=new Scanner(System.in);
		int num =sc.nextInt();
		
		try {
			Mtable o=new Mtable(num);
			o.mult();
			System.out.println("");
			o.mult(7);
			System.out.println("");
			o.mult(3, 8);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
