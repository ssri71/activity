package com.sapient.service;

public class Emp implements Cloneable{

	private int eid;
	private String name;
	public Emp(int eid,String name)
	{
		this.eid=eid;
		this.name=name;
	}
	@Override
	public String toString() {
				return eid+" "+name;
	}
	@Override
	public boolean equals(Object obj) { 
		Emp e=(Emp)obj;
		if(this==e)
			return true;
		else if(this.eid==e.eid && this.name==e.name)
			return true;
		else return false;		
	}
	@Override
	protected void finalize() throws Throwable {
			System.out.println("This obj is GCed for eid: "+eid);
	}
	@Override
	public Emp clone() throws CloneNotSupportedException { // change scope from protected to public of clone
		return (Emp)super.clone();
	}
}
