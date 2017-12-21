package com.sapient.demo;

import java.math.BigInteger;
import java.util.*;

public class facty {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("fact= " + fact(n));
		sc.close();
	}

	public static BigInteger fact(int n) {
		int i;
		BigInteger f = BigInteger.ONE;
		for (i = 1; i <= n; i++) {
			f = f.multiply(BigInteger.valueOf(i));
		}
		return f;
	}
}
