package com.sapient.service;

public class Mtable {
	private int num;
	public Mtable(int num)throws Exception{
		if(num<=0)
			throw new Exception("Num should be >0");
		this.num=num;
	}
	public void mult()
	{
		showTable(1, 10);
			
	}
	public void mult(int rows)throws Exception
	{
		if(rows>0)
		showTable(1, rows);
		else
			throw new Exception("rows should be positive");	
	}
	public void mult(int srow,int erow)throws Exception
	{
		if(erow>0 && srow>0 && erow>=srow)
		showTable(srow, erow);
		else
			throw new Exception("start and end must be positive and end>=start");
			
			
	}
	private void showTable(int strt,int end)
	{
		for(int i=strt;i<=end;i++)
		{
			System.out.printf("%d * %d= %d \n",num,i,(num*i));
		}
			
	}
}
