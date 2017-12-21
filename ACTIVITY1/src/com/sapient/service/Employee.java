package com.sapient.service;

public class Employee {
	private int stuId;
	private String stuName;
	private double eng,maths,sci,lang,social;
	public Employee(int stuId, String stuName,double eng,double maths,double sci,double lang,double social) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.eng = eng;
		this.maths = maths;
		this.lang = lang;
		this.social = social;
		this.sci = sci;
	}
	private double total(){
		return eng+maths+sci+lang+social;
	}
	private double avg(){
		return (eng+maths+sci+lang+social)/5;
	}
	public void display(){
		System.out.printf("%10d%10s%15.2f%15.2f",stuId,stuName,total(),avg());
	}
}
