package com.sapient.service;

public class OnrollEmp extends Employee {
	private double da,pf;
	public OnrollEmp(int Empid,String EmpName,double sal,double da,double pf)
	{
		super( Empid, EmpName, sal);
		this.da=da;
		this.pf=pf;
	}
	@Override
	public double calcSal() {
		double sal=getSal();
		return (sal+da-pf);
	}
	@Override
	public void display() {
		super.display();
		System.out.printf("%10.2f%10.2f%30s%20s\n",da,pf,calcSal(),getClass().getSimpleName());
	}
}
