package com.pack2;

public class Emp implements Comparable<Emp> {

	private int EmpId;
	private String ename;
	private double sal;
	public Emp(int empId, String ename, double sal) {
		super();
		EmpId = empId;
		this.ename = ename;
		this.sal = sal;
	}
	@Override
	public String toString() {
				return EmpId+" "+ename+" "+sal;
	}

	@Override
	public int compareTo(Emp o) {		//override comapreTo() of Comaparable interface
		Integer e1=this.EmpId;
		Integer e2=o.EmpId;
		return (e1.compareTo(e2));
	}
	public int getEmpId() {
		return EmpId;
	}
	public String getEname() {
		return ename;
	}
	public double getSal() {
		return sal;
	}

}
