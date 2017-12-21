package com.sapient.service;

public abstract class Account {
	private int Accid;
	private String accName;
	private double bal;

	public Account(int Accid, String accName,double bal) {
				this.Accid = Accid;
		this.accName = accName;
		this.bal=bal;

	}
	public abstract String deposit(double amt);
	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	public void display() {
		System.out.println(Accid+"  "+accName+"  "+bal);
	}
}
