package com.sapient.com;

import com.sapient.service.Calculator;
import com.sapient.service.Interest;

public class InterestClient {

	public static void main(String[] args) {
		Interest obj=Calculator.getInterest();
		System.out.println(obj.calcSI(5000, 2,2.5f));
		System.out.println(obj.calcCI(5000, 2,2.5f));
		System.out.println(obj.convert2Binary(12));
		System.out.println(obj.doSum(6,45,23,23));
		System.out.println(obj.doAvg(2,4,5,76));

	}

}
