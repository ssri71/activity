package com.sapient.service;

public class Factorial {
	public int checkFact(int num){
		int f=1;
		for(int i=1;i<=num;i++){
			f=f*i;
		}
		return f;
	}
}