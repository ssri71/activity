package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Account;
import com.sapient.service.Loan;
import com.sapient.service.Savings;

public class Accountclient {
	private static Account[] arr = new Account[2];
	static {
		arr[0] = new Savings(1001, "Ram", 5000);
		arr[1] = new Loan(1002, "Amit", 20000);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int acctype=0;
		double amt=0;
		String opt=null;
		do{
			System.out.println("enter acc type --0- Savings, --1- Loan");
		acctype=sc.nextInt();
		System.out.println("enter amount to transact");
		amt=sc.nextInt();
		System.out.println(arr[acctype].deposit(amt));
		arr[acctype].display();
			System.out.println("press y to continue");
			opt=sc.next();
		
		}while(opt.equals("y"));
		sc.close();
	}

}
