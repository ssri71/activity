package com.pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		lst.add("ram");
		lst.add("tom");
		lst.add("peter");
		lst.add("sam");
		lst.add("sunny");
		Collections.sort(lst);
		for (String str : lst) {
			System.out.println(str);
		}
		Iterator<String> it = lst.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
