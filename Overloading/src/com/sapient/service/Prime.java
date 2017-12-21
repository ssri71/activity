package com.sapient.service;

public class Prime {

	public static void findUpto(int n)
	{ int i,j,c=0;
		 for(i=2;i<=n;i++){c=0;
			 for(j=2;j<=i;j++){
				 if(i%j==0)c++;
			 }if(c==1) System.out.println(i);
		 }
	}
	public static void findUpto(int strt,int end)
	{
		int i,j,c=0;
		 for(i=strt;i<=end;i++){c=0;
			 for(j=2;j<=i;j++){
				 if(i%j==0)c++;
			 }if(c==1) System.out.println(i);
		 }
	}
}
