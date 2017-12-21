package com.sapient.service;

public class Employee {
private int empId;
private String empName;
private double sal;
private double da;
private double pf;
public Employee(int empId, String empName, double sal) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.sal = sal;
}
public double calcDa(){
	da=sal*0.03;
	return da;
}
public double calcPf(){
	pf=sal*0.2;
	return pf;
}
public double netSal(){
	return sal+da-pf;
}
public void display()
{
	System.out.printf("%10d %10s  %10.2f   %10.2f   %10.2f  %10.2f",empId,empName,calcDa(),calcPf(),sal,netSal());
}
	
}
