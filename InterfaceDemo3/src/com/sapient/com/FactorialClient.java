package com.sapient.com;

import com.sapient.service.Calculator;
import com.sapient.service.Factorial;

public class FactorialClient {

	public static void main(String[] args) {
		Factorial o = Calculator.getFactorial();
		System.out.println(o.findFact(5));
		System.out.println(o.doSum(3,5,6,76,5));
	}

}
