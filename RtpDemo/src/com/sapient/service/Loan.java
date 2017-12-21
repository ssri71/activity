package com.sapient.service;

public class Loan extends Account {

	public Loan(int Accid, String accName, double bal) {
		super(Accid, accName, bal);
	}

	@Override
	public String deposit(double amt) {
		String res = "loan cleared";
		double remain =0;
		if(amt<0)return "cant be negative";
		if (amt <= getBal() && getBal() > 0) {
			remain = getBal()-amt;
			setBal(remain);
			res = "Successful debited";
		} else if (amt > remain)
			setBal(0);
		return res;
	}

}
