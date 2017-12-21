package com.sapient.service;

import java.util.ResourceBundle;

public class EmpUtil {
	private static ResourceBundle rb;
	private static Idao dao;
	static {
		rb = ResourceBundle.getBundle("sap");
		try{
			Class cls=Class.forName(rb.getString("cname"));   //class.forName load class explicitly from property file
			dao=(Idao)cls.newInstance();						//create instance for loaded class; interace dao holding EmpMemoDemo reference
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	public static Idao getDaoInstance() {
		return dao;
	}
}
