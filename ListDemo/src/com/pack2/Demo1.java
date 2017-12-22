package com.pack2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		Emp e1=new Emp(1005,"sda",10000);
		Emp e2=new Emp(1006,"qdg",20000);
		Emp e3=new Emp(1003,"tas",15000);
		Emp e4=new Emp(1008,"kbvj",13000);
		Emp e5=new Emp(1009,"mbvj",22000);
		List<Emp> lst = new ArrayList<Emp>();
		lst.add(e1);
		lst.add(e2);
		lst.add(e3);
		lst.add(e4);
		lst.add(e5);
		Collections.sort(lst);
		System.out.println("sorts on eid");
		for(Emp e:lst){
			System.out.println(e);
		}
		Collections.sort(lst,new NameComparator());
		System.out.println("sorts on ename");
		for(Emp e:lst){
			System.out.println(e);
		}
		Collections.sort(lst,new SalComparator());
		System.out.println("sorts on salary");
		for(Emp e:lst){
			System.out.println(e);
		}
	}

}
