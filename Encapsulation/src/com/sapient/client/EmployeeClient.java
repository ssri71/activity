package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Employee;

public class EmployeeClient {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id,name,sal");
		int empId=sc.nextInt();
		String empName=sc.next();
		double sal=sc.nextDouble();
		Employee e=new Employee(empId, empName, sal);
		System.out.printf("%10s   %10s  %10s   %10s   %10s  %10s\n","EmpId","EmpName","DA","PF","SAL","NETSAL");
		e.display();
		sc.close();
	}

}
