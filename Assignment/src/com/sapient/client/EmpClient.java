package com.sapient.client;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.sapient.dao.DaoFactory;
import com.sapient.dao.IDao;
import com.sapient.exceptions.IdException;
import com.sapient.exceptions.NotfoundException;
import com.sapient.vo.Emp;

public class EmpClient {
	static Scanner sc = new Scanner(System.in);
	static IDao dao = DaoFactory.getDaoInstance();

	public static void main(String[] args) {
		String strmenu = null;
		String opt = null;
		Menu emenu = null;
		do {
			System.out.println("Choose : ADD\nEDIT\nREMOVE\nVIEW\nVIEWALL\n ");
			strmenu = sc.next();
			try {
				emenu = Menu.valueOf(strmenu);
				processMenu(emenu);
			} catch (Exception ex) {
				System.out.println("Invalid menu option");
			}
			System.out.println("press y to continue");
			opt = sc.next();
		} while (opt.equals("y"));
		sc.close();
	}

	public static void processMenu(Menu menu) {
		switch (menu) {
		case VIEWALL:
			viewall();
			break;
		case VIEW:
			viewById();
			break;
		case ADD:
			add();
			break;
		case REMOVE:
			remove();
			break;
		case EDIT:
			edit();
			break;
		}
	}

	public static void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		int eid = sc.nextInt();
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter sal");
		double sal = sc.nextDouble();
		System.out.println("Enter dept id");
		int did = sc.nextInt();
		System.out.println("Enter date(dd-MM-yyyy)");
		String strdt=sc.next();
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate doj=LocalDate.parse(strdt,df);
		Emp emp=new Emp(eid, name, sal, did, doj);
		try {
			dao.addEmployee(emp);
			System.out.println("Employee Added");
		} catch (IdException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void viewall() {
		List<Emp> lst = dao.viewEmployee();
		for (Emp emp : lst) {
			System.out.println(emp);
		}
	}

	public static void viewById() {
		int eid = sc.nextInt();
		Emp e;
		try {
			e = dao.viewEmployee(eid);
			System.out.println(e);
		} catch (NotfoundException e1) {
			System.out.println(e1.getMessage());
		}
	}
	public static void remove() {
		System.out.println("Enter id");
		int eid = sc.nextInt();
		try {
			dao.removeEmployee(eid);
		} catch (NotfoundException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void edit() {
		System.out.println("Enter id");
		int eid = sc.nextInt();
		System.out.println("Enter sal");
		double sal = sc.nextDouble();

		try {
			dao.updateSalary(eid, sal);
		} catch (NotfoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
