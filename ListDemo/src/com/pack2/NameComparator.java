package com.pack2;

import java.util.Comparator;

public class NameComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		String str1=o1.getEname();
		String str2=o2.getEname();
		return str1.compareTo(str2);
	}

}
