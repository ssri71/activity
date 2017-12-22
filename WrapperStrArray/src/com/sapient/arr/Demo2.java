package com.sapient.arr;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		String[] arr = { "ram", "petrer", "tom", "sam", "boyle" };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.next();
		int res=Arrays.binarySearch(arr,str);
		if(res>=0){System.out.println(res);}
		else{
			System.out.println("not found");
			
		}sc.close();
	}

}
