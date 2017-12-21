package com.sapient.service;

public class Mobile extends Product {
	private String Campx;

	public Mobile(int prod_id, String prod_name, double price, String Campx) {
		super(prod_id, prod_name, price);
		this.Campx = Campx;
	}

	@Override
	public String isExpensive() {
		double price = getPrice();
		String res = null;
		if (price > 50000)
			res = "expensive";
		else if (price >= 10000)
			res = "average";
		else
			res = "cheap";
		return res;
	}
	public void display(){
		super.display();
		System.out.printf("%20s%20s%20s\n",Campx,isExpensive(),getClass().getSimpleName());
	}

}
