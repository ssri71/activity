package com.pack1;

import java.util.HashSet;
import java.util.Set;
public class SetDemo1 {

	public static void main(String[] args) {
		Set<String> set=new HashSet<String>(32,0.5f);					//hashset random;treeset sorted,linkedset insertion order;;;;; (capacity,load factor)
		set.add("ram");
		set.add("shyam");
		set.add("tom");
	//	set.add("sam");					duplicates are ignored
		set.add("sam");
		set.add("jay");
		for(String str:set)
		{
			System.out.println(str);
		}
	}

}
