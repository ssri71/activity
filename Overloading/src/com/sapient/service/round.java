package com.sapient.service;

public class round {

	public static double roundTon(int n,double num) {
		return Math.round(num * Math.pow(10, n)) / Math.pow(10, n);
	}
	public static double roundTon(double num) {
		return Math.round(num * Math.pow(10, 2)) / Math.pow(10, 2);
	}
}
