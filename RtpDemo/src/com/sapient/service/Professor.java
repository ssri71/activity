package com.sapient.service;

public class Professor extends Member{
	private double percent;
	public Professor(int Empid,String EmpName,double percent)
	{
		super( Empid, EmpName);
		this.percent=percent;
	}
	public String isOutstanding() {
		String res=null;
		if(percent>90)
			res="Outstanding";
			else
				res="Not Outstanding";
		return res;
	}
	@Override
	public void display() {
		super.display();
		System.out.printf("%40.0f%20s%20s\n",percent,isOutstanding(),getClass().getSimpleName());
	}
}
