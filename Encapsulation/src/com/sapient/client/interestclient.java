package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.interest;;

public class interestclient {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amt");
		double amt=sc.nextDouble();
		System.out.println("enter rate");
		double rate=sc.nextDouble();
		System.out.println("enter years");
		int year=sc.nextInt();
		try{interest o=new interest();
		o.setAmt(amt);
		o.setRate(rate);
		o.setYears(year);
		System.out.println("CI is-  "+o.calcCi());
		System.out.println("SI is-   "+o.calcSi());
		}
		catch(Exception e)
		{System.out.println(e.getMessage());}
		sc.close();
	}

}
