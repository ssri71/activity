package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Emp;

public class EmpClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int stuID = sc.nextInt();
		String stuName = sc.next();
		double eng = sc.nextDouble();
		double math = sc.nextDouble();
		double sci = sc.nextDouble();
		double lang = sc.nextDouble();
		double social = sc.nextDouble();
		Emp e = new Emp();
		e.setEng(eng);
		e.setMaths(math);
		e.setSci(sci);
		e.setSocial(social);
		e.setLang(lang);
		e.setStuId(stuID);
		e.setStuName(stuName);
		System.out.printf("%10s%10s%10s%10s\n","StuId","StuName","Total","Avg");
		e.display();
		sc.close();

	}

}
