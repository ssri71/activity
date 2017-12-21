package com.sapient.client;

public class varargsdemo {

	public static void main(String[] args) {
		System.out.println(sum(4,9,8,3,23,234));
	}

	public static int sum(int... arr) {
		System.out.println("var args called");
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum += arr[i];
		return sum;
	}
}
