package com.sapient.service;

public class Trainee extends Member {
	private double rating;
	public Trainee(int Empid,String EmpName,double rating)
	{
		super( Empid, EmpName);
		this.rating=rating;
	}
	public String isOutstanding() {
		String res=null;
		if(rating>=5)
			res="Outstanding";
			else
				res="Not Outstanding";
		return res;
	}
	@Override
	public void display() {
		super.display();
		System.out.printf("%20.0f%40s%20s\n",rating,isOutstanding(),getClass().getSimpleName());
	}
}
