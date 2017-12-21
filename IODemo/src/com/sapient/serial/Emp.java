package com.sapient.serial;

import java.io.Serializable;

public class Emp implements Serializable {
	private int eid;
	//private transient String ename; 			//transient prevents ename from being serialized 
	private String ename;
	private double sal;
	public Emp(int eid, String ename, double sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}
	@Override
	public String toString() {		
		return eid+" "+ename+" "+sal;
	}

}
