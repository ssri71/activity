package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.pack1.Emp;

public class Demo1 {

	public static void main(String[] args) {
		Emp e1 = new Emp(1005, "sda", 10000); // empid is unique so we set it as hashcode
		Emp e2 = new Emp(1006, "qdg", 20000);
		Emp e3 = new Emp(1003, "tas", 15000);
		Map<Integer, Emp> map = new HashMap<Integer, Emp>();
		map.put(1005,e1);
		map.put(1006,e2);
		map.put(1003,e3);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter emp id");
		int eid=sc.nextInt();
		if(map.containsKey(eid)){
			Emp e =map.get(eid);
			System.out.println(e);
		}System.out.println(map.size());
		
	}

}
