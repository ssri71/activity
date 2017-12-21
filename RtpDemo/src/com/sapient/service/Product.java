package com.sapient.service;

public abstract class Product {
	private int prod_id;
	private String prod_name;
	private double price;

	public Product(int prod_id, String prod_name, double price) {
		this.price = price;
		this.prod_id = prod_id;
		this.prod_name = prod_name;

	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void display() {
		System.out.printf("%10d%20s%10.2f", prod_id, prod_name, price);
	}

	public abstract String isExpensive();

	public double getPrice() {
		return price;
	}
}
