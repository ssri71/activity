package com.sapient.service;
import java.util.Arrays;

public class Items {

	public void asc(int[] arr) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

	public void desc(int[] arr) {
		Arrays.sort(arr);
		for(int i=arr.length-1;i>=0;i--){
			System.out.println(arr[i]);
		}
	}
}
