package com.sapient.client;
import com.sapient.demo.car;
public class constructo {

	public static void main(String[] args) {
		try{
		car c3=new car(1001,"Audi",220000);
		c3.display();}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}