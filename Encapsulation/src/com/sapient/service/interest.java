package com.sapient.service;

public class interest {			// MUTABLE
	private double amt;
	private int years;
	private double rate;

	public void setAmt(double amt)throws Exception {
		if(amt<5000)
			throw new Exception("Amt must be >5000");
		this.amt = amt;
	}

	public void setYears(int years)throws Exception {
		if(years<=0)
			throw new Exception("Time must be positve");
		this.years = years;
	}

	public void setRate(double rate) throws Exception{
		if(rate<=0||rate>30)
			throw new Exception("rate must be b/w 0 and 1 ");
		this.rate = rate;
	}

	public double calcSi(){
		double si=amt*years*rate/100;
		return si;
	}
	public double calcCi(){
		double ci=amt*Math.pow(1+rate/100,years);
		return ci;
	}
}
