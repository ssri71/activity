package com.sapient.service;

public class Computer extends Product{   // error 2 rsn bcoz product has default const and method not overriden
	private String hdd;
	public Computer(int prod_id,String prod_name,double price,String hdd)
	{
		super(prod_id,prod_name,price);
		this.hdd=hdd;
	}
	@Override
	public String isExpensive() {
		double price=getPrice();
		String res=null;
		if(price>50000)
			res="expensive";
		else if(price>=10000)
			res="average";
		else res="cheap";
		return res;
	}
	@Override
	public void display() {
		super.display();
		System.out.printf("%10s%30s%20s\n",hdd,isExpensive(),getClass().getSimpleName());
	}
	
}
