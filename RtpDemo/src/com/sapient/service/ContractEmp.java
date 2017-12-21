package com.sapient.service;

public class ContractEmp extends Employee{
	private int days;
	public ContractEmp(int Empid,String EmpName,double sal,int days)
	{
		super( Empid, EmpName, sal);
		this.days=days;
	}
	@Override
	public double calcSal() {
		double sal=getSal();
		return sal*days;
	}
	@Override
	public void display() {
		super.display();
		System.out.printf("%20d%30s%20s\n",days,calcSal(),getClass().getSimpleName());
	}
}
