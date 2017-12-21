package com.sapient.service;

public abstract class Member {

	private int Empid;
	private String EmpName;

	public Member(int Empid, String EmpName) {
				this.Empid = Empid;
		this.EmpName = EmpName;

	}

	public void display() {
		System.out.printf("%10d%20s",Empid, EmpName);
	}


}
