package com.sapient.service;

public class Area {						// IMMUTABLE
	private double r;
	
	public Area(double r)throws Exception{
		super();
		if(r<=0)
			throw new Exception("radii  must be positive");
		this.r=r;
	}
	public  double circArea(){
		double ar=(Math.PI)*r*r;
		return ar;
		
	}
	public  double circPeri(){
		double pr=2*(Math.PI)*r;
		return pr;
	}
}
