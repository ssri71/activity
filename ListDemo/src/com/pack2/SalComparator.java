package com.pack2;

import java.util.Comparator;

public class SalComparator  implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		Double str1=o1.getSal();
		Double str2=o2.getSal();
		return str1.compareTo(str2);
	}

}
