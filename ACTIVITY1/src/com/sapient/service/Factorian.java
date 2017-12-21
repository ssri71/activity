package com.sapient.service;
import  com.sapient.service.Factorial;

public class Factorian {
	Factorial f=new Factorial();
	public String checkFactorian(int num){
		int d,sum=0,n=num;
		while(num>0)
		{
			d=num%10;
			sum+=f.checkFact(d);
			num=num/10;
		}
		if(n==sum)return "Its a factorian number";
		else return "Its not a factorian number";
	}
}
