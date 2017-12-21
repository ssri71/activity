package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Employee;

public class EmployeeClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int stuID = sc.nextInt();
		String stuName = sc.next();
		double eng = sc.nextDouble();
		double math = sc.nextDouble();
		double sci = sc.nextDouble();
		double lang = sc.nextDouble();
		double social = sc.nextDouble();
		Employee e = new Employee(stuID, stuName, eng, math, sci, lang, social);
		System.out.printf("%10s   %10s  %10s   %10s   \n","StuId","StuName","Total","Avg");
		e.display();
		sc.close();
	}

}
