package com.sapient.service;

public interface Basic {

	 String convert2Binary(int num);
	public default int doSum(int ...a) {      	//default for implemented methods in interface
		int sum=0;
		for(int val:a)
			sum=sum+val;
		return sum;
	}
	public default double doAvg(int ...a) {
		int sum=doSum(a);
		return sum/a.length;
	}
	/*public static void display(){  	 			//interface name used for accessing it
		System.out.println();
	}*/
}