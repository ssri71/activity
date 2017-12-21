package com.sapient.serial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializeDemo  {

	
	/*@Override
	protected void writeStreamHeader() throws IOException {
		reset();
	}
	protected SerializeDemo()throws IOException,SecurityException{
		super();
	}*/
	public static void main(String[] args) throws IOException {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter employee id");
		int eid=sc.nextInt();
		System.out.println("enter employee name");
		String name=sc.next();
		System.out.println("enter employee salary");
		double sal=sc.nextDouble();
		*/FileOutputStream fos=new FileOutputStream("employee.txt"); //append
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Emp e1=new Emp(1001,"ram",1000);
		Emp e2=new Emp(1002,"dasd",2000);
		Emp e3=new Emp(1003,"sasd",3000);
		oos.writeObject(e1); 
		oos.writeObject(e2); 
		oos.writeObject(e3); //
		oos.close();
		fos.close();
	//	sc.close();
		System.out.println("Serializable");
	}

}
