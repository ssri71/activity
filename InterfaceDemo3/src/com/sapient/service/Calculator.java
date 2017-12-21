package com.sapient.service;

import java.math.BigInteger;

public class Calculator implements Interest,Factorial {

	private static Calculator calc=new Calculator();
	private Calculator(){};
	
	public static Basic getBasic()
	{
		Basic obj=calc;
		return obj;
	}

	public static Interest getInterest()
	{
		Interest obj=calc;
		return obj;
	}
	public static Factorial getFactorial()
	{
		Factorial obj=calc;
		return obj;
	}
	@Override
	public String convert2Binary(int num) {
		return Integer.toBinaryString(num);
				
	}
	
	@Override
	public double calcSI(double amt, int years, float rate) {
		return amt*years*rate;
	}

	@Override
	public double calcCI(double amt, int years, float rate) {
		return (Math.pow(1+rate/100, years)*amt);
	}
	@Override
	public BigInteger findFact(int num)
	{
		BigInteger fact=BigInteger.ONE;
		for(int i=1;i<=num;i++)
			fact=fact.multiply(BigInteger.valueOf(i));
		return fact;
	}

	@Override
	public int doSum(int... a) {						//override default method defined in  basic for factorial to access it
		return Interest.super.doSum(a);		// super refers to default method
	}
}
