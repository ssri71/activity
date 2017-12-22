package com.pack1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo3 {

	public static void main(String[] args) {
		Emp e1=new Emp(1005,"sda",10000);												//empid is unique so we set it as hashcode
		Emp e2=new Emp(1006,"qdg",20000);
		Emp e3=new Emp(1003,"tas",15000);
		Emp e4=new Emp(1008,"kbvj",13000);
		Emp e5=new Emp(1009,"mbvj",22000);
		Emp e6=new Emp(1005,"qwe",25000);		//ignored based on (overriden hashCode() and equals())
		Emp e7=e2;									//ignored based on the reference
		Set<Emp> set=new TreeSet<Emp>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);
		set.add(e7);
		for(Emp emp:set){
			System.out.println(emp);
		}

	}

}
