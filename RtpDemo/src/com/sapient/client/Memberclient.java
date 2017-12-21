package com.sapient.client;

import com.sapient.service.Member;
import com.sapient.service.Professor;
import com.sapient.service.Trainee;

public class Memberclient {
	public static void main(String[] args) {
		Member[] arr = new Member[4];
		arr[0] = new Professor(1001, "Amar", 92);
		arr[1] = new Professor(1002, "Harman", 80);
		arr[2] = new Trainee(1003, "Sagar", 6);
		arr[3] = new Trainee(1004, "Ram", 3);
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.printf("%10s%20s%20s%20s%20s%15s\n", "EmpID", "EmpNAME", "Rating", "Percentage", "Is Outstanding", "TYPE");
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		for (Member emp : arr)
			emp.display();
		System.out.println("-------------------------------------------------------------------------------------------------------------");
	}
}
