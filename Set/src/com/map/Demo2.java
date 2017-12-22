package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1005, "ram");
		map.put(1006, "diksha");
		map.put(1003, "tiwari"); // replaced by tom
		map.put(1003, "tom");
		map.put(1001, "jksd");
		map.put(1002, "sdasd");
		System.out.println("iterating using keySet()");
		Set<Integer> set = map.keySet();
		for (Integer key : set)
			System.out.println(key + "    " + map.get(key));
		/*System.out.println("\niterating using values()");
		Collection<String> col = map.values();
		for (String str : col)
			System.out.println(str);
		System.out.println("\niterating using entrySet()");
		Set<Entry<Integer,String>> entries=map.entrySet();
		for(Entry e:entries){
			System.out.println(e.getKey()+"  "+e.getValue());
		}*/
	}

}
