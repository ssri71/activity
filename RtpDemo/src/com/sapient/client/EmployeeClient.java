package com.sapient.client;

import com.sapient.service.ContractEmp;
import com.sapient.service.Employee;
import com.sapient.service.OnrollEmp;

public class EmployeeClient {

	public static void main(String[] args) {
		Employee[] arr = new Employee[4];
		arr[0] = new OnrollEmp(1001, "Amar", 35000, 8000, 800);
		arr[1] = new OnrollEmp(1002, "Harman", 20000, 6020, 200);
		arr[2] = new ContractEmp(1003, "Sagar", 38000, 14);
		arr[3] = new ContractEmp(1004, "Ram", 35000, 16);
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.printf("%10s%20s%10s%10s%10s%20s%15s%15s\n", "EmpID", "EmpNAME", "SALARY", "DA", "PF", "DAYS","Net Salary", "TYPE");
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		for (Employee emp : arr)
			emp.display();
		System.out.println("-------------------------------------------------------------------------------------------------------------");
	}
}
