package com.sapient.client;
import com.sapient.service.Computer;
import com.sapient.service.Mobile;
import com.sapient.service.Product;
public class ProductClient {

	public static void main(String[] args) {
	
		Product []arr=new Product[4];
		arr[0]=new Computer(1001, "Acer Laptop", 35000,"4TB");
		arr[1]=new Computer(1002, "Hp Laptop", 20000,"2TB");
		arr[2]=new Mobile(1003, "Samsung", 7000,"14Mp");
		arr[3]=new Mobile(1004, "iphone", 35000,"16.2Mp");
		System.out.println("---------------------------------------------");
		System.out.printf("%10s%20s%10s%10s%10s%20s%20s\n","PID","PNAME","PRICE","HDD","CAM","RANGE","TYPE");
		System.out.println("---------------------------------------------");
		for(Product prod:arr)
			prod.display();
		System.out.println("---------------------------------------------");
	}

}
