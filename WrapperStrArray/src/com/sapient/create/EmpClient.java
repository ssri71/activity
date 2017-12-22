package com.sapient.create;

public class EmpClient {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		Class cls=Class.forName("com.sapient.create.Emp");							//as class is loaded static block executes
		Emp e=(Emp)cls.newInstance();
		e.display();
	}

}
