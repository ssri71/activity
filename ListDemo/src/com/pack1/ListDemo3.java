package com.pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo3 {

	public static void main(String[] args) {
		List<String> lst=new ArrayList<String>();
		lst.add("ram");
		lst.add("tom");
		lst.add("peter");
		lst.add("sam");
		lst.add("sunny");
		System.out.println("Forward Way");
		ListIterator<String> it=lst.listIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("Reverse Way");
		while(it.hasPrevious()){
			System.out.println(it.previous());
		}
		
	}

}
