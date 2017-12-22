package com.sapient.dao;

import java.util.ResourceBundle;

public class DaoFactory {
	private static ResourceBundle rb;
	private static IDao dao;
	static {
		rb = ResourceBundle.getBundle("sap");
		try{
			Class cls=Class.forName(rb.getString("cname"));   //class.forName load class explicitly from property file
			dao=(IDao)cls.newInstance();						//create instance for loaded class; interace dao holding EmpMemoDemo reference
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	public static IDao getDaoInstance() {
		return dao;
	}
}
