package com.sapient.demo;

public class car {

	private int carid;
	private String carname;
	double price;

	public car(int carid) throws Exception {

		System.out.println("one arg const");
		if (carid < 1000)
			throw new Exception("carid must be >= 1000");
		this.carid = carid;
	}

	public car(int carid, String carname) throws Exception {
		this(carid);
		System.out.println("two arg const");
		if (!carname.matches("[a-zA-Z]{3,10}"))
			throw new Exception("car name must contain 3-10 characters");
		this.carname = carname;
	}

	public car(int carid, String carname, double price) throws Exception {
		this(carid, carname);
		System.out.println("three arg const");
		if (price < 100000)
			throw new Exception("car name must be>100000 ");
		this.price = price;
	}

	public void display() {
		System.out.println(carid + "    " + carname + "    " + price);

	}
}
