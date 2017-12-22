package com.pack1;

import java.util.ArrayList;
import java.util.List;

public class ListDemo4 {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		lst.add("ram");
		lst.add("tom");
		lst.add("peter");
		lst.add("sam");
		lst.add("sunny");
		System.out.println(lst);
		lst.add(2, "vikas");
		System.out.println(lst);
		System.out.println(lst.remove(3));
		System.out.println(lst);
		System.out.println(lst.remove("ram"));
		System.out.println(lst);
		System.out.println(lst.size());
		System.out.println("get at idx 2  " + lst.get(2));
		// -------------------------------------------------------------
		List<String> lst2 = new ArrayList<String>();
		lst2.add("varun");
		lst2.add("tarun");
		lst2.addAll(lst);
		System.out.println(lst2);
		//--------------------------------------------------------------
	}

}
