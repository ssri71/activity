package com.sapient.arr;

import java.util.Arrays;

public class Demo3 {

	public static void main(String[] args) {
		String[] arr1 = { "ram", "petrer", "tom", "sam", "boyle" };
		String[] arr2 = new String[arr1.length];
		System.arraycopy(arr1, 0, arr2, 0, 5);
		System.out.println(Arrays.toString(arr2));
	}

}
