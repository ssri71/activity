package com.sapient.client;
import com.sapient.service.*;
import java.util.Scanner;

public class areaclient {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radii");
		double rad=sc.nextDouble();
		try{Area o=new Area(rad);
		System.out.println("Area is-  "+o.circArea());
		System.out.println("Perimeter is-   "+o.circPeri());
		}
		catch(Exception e)
		{System.out.println(e.getMessage());}
		sc.close();
	}

}
