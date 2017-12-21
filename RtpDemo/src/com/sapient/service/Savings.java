package com.sapient.service;

public class Savings extends Account{
	public Savings (int Accid, String accName,double bal){
		super(Accid, accName, bal);
	}
	@Override
	public String deposit(double amt){
		double remain=getBal()+amt;
		if(amt<0)return "cant be negative";
		setBal(remain);
		return "successfully deposited";
	}
}
