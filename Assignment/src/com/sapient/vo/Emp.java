package com.sapient.vo; //package means value object

import java.time.LocalDate;

public class Emp implements Comparable<Emp> {
	private int empId;
	private String ename;
	private double sal;
	private int deptId;
	private LocalDate doj; // LocalDate-convert string into a date


	public Emp(int empId, String ename, double sal, int deptId, LocalDate doj) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.sal = sal;
		this.deptId = deptId;
		this.doj = doj;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEname() {
		return ename;
	}

	public double getSal() {
		return sal;
	}

	public int getDeptId() {
		return deptId;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return empId + "  " + ename + "  " + sal + "   " + deptId + "   " + doj;
	}

	@Override
	public int compareTo(Emp e) {
		Integer e1 = this.empId;
		Integer e2 = e.empId;
		return e1.compareTo(e2);
	}
}
