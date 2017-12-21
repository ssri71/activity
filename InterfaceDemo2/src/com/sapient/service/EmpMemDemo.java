package com.sapient.service;

import java.util.ArrayList;
import java.util.List;

public class EmpMemDemo implements Idao{

	EmpMemDemo(){
		//instance cannot be created in another package;default
	}
	@Override
	public List<String> viewEmployee() {
		System.out.println("empmemodemo instance");
		List<String> list=new ArrayList<String>();
		list.add("Rama");
		list.add("Vikas");
		list.add("Tarun");
		return list;
	}

}
