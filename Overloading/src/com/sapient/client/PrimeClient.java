package com.sapient.client;

import com.sapient.service.Prime;

public class PrimeClient {

	public static void main(String[] args) {
		Prime.findUpto(50);
		System.out.println("\n");
		Prime.findUpto(20,60);
	}

}
