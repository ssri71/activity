package com.sapient.service;

public class Armstrong {

	public String checkArms(int num){
		int d,sum=0,n=num;
		while(num>0)
		{
			d=num%10;
			sum+=(d*d*d);
			num=num/10;
		}
		if(n==sum)return "Its a armstrong number";
		else return "Its not a armstrong number";
	}
}
