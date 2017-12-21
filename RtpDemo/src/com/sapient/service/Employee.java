package com.sapient.service;

public abstract class Employee {

	private int Empid;
	private String EmpName;
	private double sal;

	public Employee(int Empid, String EmpName, double sal) {
		this.sal = sal;
		this.Empid = Empid;
		this.EmpName = EmpName;

	}

	public void display() {
		System.out.printf("%10d%20s%14.2f",Empid, EmpName, sal);
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public abstract double calcSal();


}
