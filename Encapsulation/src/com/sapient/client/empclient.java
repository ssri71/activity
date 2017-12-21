package com.sapient.client;
import com.sapient.service.EMP;;
public class empclient {

	public static void main(String[] args) {
		try{
		EMP	e=new EMP();
		e.setName("Sheila");
		e.setAge(19);
		System.out.println(e.getName()+"   "+e.getAge()+"   "+e.getBusunit());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
