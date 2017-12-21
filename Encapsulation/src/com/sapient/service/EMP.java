package com.sapient.service;

public class EMP {

	private String name;
	private int age;
	private String busunit="Razorfish";
	public String getName() {
		return name;
	}
	public void setName(String name)throws Exception {
		if(!name.matches("[a-zA-Z]{3,15}"))
			throw new Exception("name must contain 3 to 15 characters");
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age)throws Exception {
		if(age>60||age<18)
			throw new Exception("age must be b/w 18 and 60");
		this.age = age;
	}
	public String getBusunit() {
		return busunit;
	}
	
}
