package com.sapient.client;


public class LeapYrClient {
public String Leap(int year){
	if(year%4==0||year%400==0)
	{
		return "Its a leap year";
	}else return "Its not a leap year";
}
	
}
